package com.prestacapital.WorkflowAutomator.service;

import com.prestacapital.WorkflowAutomator.entity.Approvers;
import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import com.prestacapital.WorkflowAutomator.repository.ApprovalRequestRepository;
import com.prestacapital.WorkflowAutomator.repository.ApproversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApproversService {
    private final ApproversRepository approversRepository;
    private final ApprovalRequestRepository approvalRequestRepository;

    @Autowired
    public ApproversService(ApproversRepository approversRepository,
                            ApprovalRequestRepository approvalRequestRepository) {
        this.approversRepository = approversRepository;
        this.approvalRequestRepository = approvalRequestRepository;
    }

    public Approvers addNewApprover(Approvers approver) {
        return approversRepository.save(approver);
    }

    public List<Optional<Approvers>> getApproverByDocumentType(DocumentTypes documentType) {
        return approversRepository.getApproverByDocumentType(documentType);
    }
}
