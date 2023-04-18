package com.prestacapital.ApprovalsInitiator.service;

import com.prestacapital.WorkflowAutomator.Data.ApproveAction;
import com.prestacapital.WorkflowAutomator.Utils.Utils;
import com.prestacapital.WorkflowAutomator.entity.ApprovalRequest;
import com.prestacapital.WorkflowAutomator.repository.ApprovalRequestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;

    @Autowired
    public ApprovalRequestService(ApprovalRequestRepository approvalRequestRepository) {
        this.approvalRequestRepository = approvalRequestRepository;
    }

    public ApprovalRequest makeApprovalRequest(ApprovalRequest approvalRequest) {
        approvalRequest.createdAt = Utils.getCurrentDateTime.apply(null);
        return approvalRequestRepository.save(approvalRequest);
    }

    public List<Optional<ApprovalRequest>> getApprovalRequests(Boolean approved) {

        return approvalRequestRepository.getApprovalrequestByStatus(approved);
    }

    @Transactional
    public ApprovalRequest approveOrReject(ApproveAction approveAction) {

        ApprovalRequest approvalRequest = approvalRequestRepository.findById(approveAction.approveRequestId)
                .orElseThrow(()-> new IllegalStateException("The Approval Request  with Id "+ approveAction.approveRequestId+ " does Not exist."));

        if(Objects.equals(approveAction.approved, "Approve")){

            approvalRequest.setApproved(true);

        }else {
            approvalRequest.setApproved(false);
        }

        return approvalRequest;
    }
}
