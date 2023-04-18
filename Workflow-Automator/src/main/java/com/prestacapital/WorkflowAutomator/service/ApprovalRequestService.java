package com.prestacapital.WorkflowAutomator.service;

import com.prestacapital.WorkflowAutomator.Data.ApproveAction;
import com.prestacapital.WorkflowAutomator.Utils.Utils;
import com.prestacapital.WorkflowAutomator.entity.ApprovalRequest;
import com.prestacapital.WorkflowAutomator.repository.ApprovalRequestRepository;
import com.prestacapital.WorkflowAutomator.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;
    private RestTemplate restTemplate ;

    private RestTemplateBuilder restTemplateBuilder;
    private final DocumentTypeRepository documentTypeRepository;

    @Autowired
    public ApprovalRequestService(ApprovalRequestRepository approvalRequestRepository,
                                  DocumentTypeRepository documentTypeRepository) {
        this.approvalRequestRepository = approvalRequestRepository;
        this.documentTypeRepository = documentTypeRepository;
    }

    public ApprovalRequest makeApprovalRequest(ApprovalRequest approvalRequest) {
        documentTypeRepository.findById(approvalRequest.documentTypeId)
                .orElseThrow(()-> new IllegalStateException("The Document Type  with Id "+ approvalRequest.documentTypeId+ " does Not exist."));
        approvalRequest.createdAt = Utils.getCurrentDateTime();

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
            //sendApprovalNotificationToInitiator(approvalRequest);
        }

        return approvalRequest;
    }


    public void sendApprovalNotificationToInitiator(ApprovalRequest approvalRequest) {
        restTemplate = restTemplateBuilder.build();
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        // build the request
        HttpEntity<ApprovalRequest> entity = new HttpEntity<>(approvalRequest, headers);
        // send POST request
        restTemplate.postForObject(Utils.URL, entity, ApprovalRequest.class);

    }
}
