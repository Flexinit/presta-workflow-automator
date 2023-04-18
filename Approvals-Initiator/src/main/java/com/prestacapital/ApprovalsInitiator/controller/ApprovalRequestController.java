package com.prestacapital.ApprovalsInitiator.controller;

import com.prestacapital.ApprovalsInitiator.service.ApprovalRequestService;
import com.prestacapital.WorkflowAutomator.entity.ApprovalRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/approvals")
public class ApprovalRequestController {
    private final ApprovalRequestService approvalRequestService;

    @Autowired
    public ApprovalRequestController(ApprovalRequestService approvalRequestService) {
        this.approvalRequestService = approvalRequestService;
    }

    @PostMapping
    public ApprovalRequest makeApprovalRequest(@RequestBody ApprovalRequest approvalRequest){
        return approvalRequestService.makeApprovalRequest(approvalRequest);
    }
}
