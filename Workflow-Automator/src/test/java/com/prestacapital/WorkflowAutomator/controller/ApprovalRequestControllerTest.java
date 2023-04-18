package com.prestacapital.WorkflowAutomator.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.prestacapital.WorkflowAutomator.Data.ApproveAction;
import com.prestacapital.WorkflowAutomator.entity.ApprovalRequest;
import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import com.prestacapital.WorkflowAutomator.repository.ApprovalRequestRepository;
import com.prestacapital.WorkflowAutomator.service.ApprovalRequestService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ApprovalRequestControllerTest {
    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    void testMakeApprovalRequest() {


        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setDocumentType(documentTypes);
        ApprovalRequestRepository approvalRequestRepository = mock(ApprovalRequestRepository.class);
        when(approvalRequestRepository.save((ApprovalRequest) any())).thenReturn(approvalRequest);
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(
                new ApprovalRequestService(approvalRequestRepository));

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentTypeDescription("Document Description");
        documentTypes1.setDocumentTypeId("42");
        documentTypes1.setDocumentTypeName("Document Name");
        documentTypes1.setId(123L);

        ApprovalRequest approvalRequest1 = new ApprovalRequest();
        approvalRequest1.setDocumentType(documentTypes1);
        assertSame(approvalRequest, approvalRequestController.makeApprovalRequest(approvalRequest1));
        verify(approvalRequestRepository).save((ApprovalRequest) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMakeApprovalRequest2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.ApprovalRequestService.makeApprovalRequest(com.prestacapital.WorkflowAutomator.entity.ApprovalRequest)" because "this.approvalRequestService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.ApprovalRequestController.makeApprovalRequest(ApprovalRequestController.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        ApprovalRequestController approvalRequestController = new ApprovalRequestController(null);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setDocumentType(documentTypes);
        approvalRequestController.makeApprovalRequest(approvalRequest);
    }

    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    void testMakeApprovalRequest3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setDocumentType(documentTypes);
        ApprovalRequestService approvalRequestService = mock(ApprovalRequestService.class);
        when(approvalRequestService.makeApprovalRequest((ApprovalRequest) any())).thenReturn(approvalRequest);
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(approvalRequestService);

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentTypeDescription("Document Description");
        documentTypes1.setDocumentTypeId("42");
        documentTypes1.setDocumentTypeName("Document Name");
        documentTypes1.setId(123L);

        ApprovalRequest approvalRequest1 = new ApprovalRequest();
        approvalRequest1.setDocumentType(documentTypes1);
        assertSame(approvalRequest, approvalRequestController.makeApprovalRequest(approvalRequest1));
        verify(approvalRequestService).makeApprovalRequest((ApprovalRequest) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    void testMakeApprovalRequest4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setApprovalStep("Approval Step");
        approvalRequest.setApproved(true);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest.setDescription("The characteristics of someone or something");
        approvalRequest.setDocumentType(documentTypes);
        approvalRequest.setEmailAddress("42 Main St");
        approvalRequest.setFirstName("Jane");
        approvalRequest.setIDNumber("42");
        approvalRequest.setId(123L);
        approvalRequest.setLastName("Doe");
        approvalRequest.setPhoneNumber("4105551212");
        approvalRequest.setRequestId("42");
        ApprovalRequestRepository approvalRequestRepository = mock(ApprovalRequestRepository.class);
        when(approvalRequestRepository.save((ApprovalRequest) any())).thenReturn(approvalRequest);
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(
                new ApprovalRequestService(approvalRequestRepository));

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentTypeDescription("Document Description");
        documentTypes1.setDocumentTypeId("42");
        documentTypes1.setDocumentTypeName("Document Name");
        documentTypes1.setId(123L);

        ApprovalRequest approvalRequest1 = new ApprovalRequest();
        approvalRequest1.setApprovalStep("Approval Step");
        approvalRequest1.setApproved(true);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest1.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest1.setDescription("The characteristics of someone or something");
        approvalRequest1.setDocumentType(documentTypes1);
        approvalRequest1.setEmailAddress("42 Main St");
        approvalRequest1.setFirstName("Jane");
        approvalRequest1.setIDNumber("42");
        approvalRequest1.setId(123L);
        approvalRequest1.setLastName("Doe");
        approvalRequest1.setPhoneNumber("4105551212");
        approvalRequest1.setRequestId("42");
        assertSame(approvalRequest, approvalRequestController.makeApprovalRequest(approvalRequest1));
        verify(approvalRequestRepository).save((ApprovalRequest) any());
        Date expectedCreatedAt = approvalRequest1.createdAt;
        assertSame(expectedCreatedAt, approvalRequest1.getCreatedAt());
    }

    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMakeApprovalRequest5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.ApprovalRequestService.makeApprovalRequest(com.prestacapital.WorkflowAutomator.entity.ApprovalRequest)" because "this.approvalRequestService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.ApprovalRequestController.makeApprovalRequest(ApprovalRequestController.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        ApprovalRequestController approvalRequestController = new ApprovalRequestController(null);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setApprovalStep("Approval Step");
        approvalRequest.setApproved(true);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest.setDescription("The characteristics of someone or something");
        approvalRequest.setDocumentType(documentTypes);
        approvalRequest.setEmailAddress("42 Main St");
        approvalRequest.setFirstName("Jane");
        approvalRequest.setIDNumber("42");
        approvalRequest.setId(123L);
        approvalRequest.setLastName("Doe");
        approvalRequest.setPhoneNumber("4105551212");
        approvalRequest.setRequestId("42");
        approvalRequestController.makeApprovalRequest(approvalRequest);
    }

    /**
     * Method under test: {@link ApprovalRequestController#makeApprovalRequest(ApprovalRequest)}
     */
    @Test
    void testMakeApprovalRequest6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setApprovalStep("Approval Step");
        approvalRequest.setApproved(true);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest.setDescription("The characteristics of someone or something");
        approvalRequest.setDocumentType(documentTypes);
        approvalRequest.setEmailAddress("42 Main St");
        approvalRequest.setFirstName("Jane");
        approvalRequest.setIDNumber("42");
        approvalRequest.setId(123L);
        approvalRequest.setLastName("Doe");
        approvalRequest.setPhoneNumber("4105551212");
        approvalRequest.setRequestId("42");
        ApprovalRequestService approvalRequestService = mock(ApprovalRequestService.class);
        when(approvalRequestService.makeApprovalRequest((ApprovalRequest) any())).thenReturn(approvalRequest);
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(approvalRequestService);

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentTypeDescription("Document Description");
        documentTypes1.setDocumentTypeId("42");
        documentTypes1.setDocumentTypeName("Document Name");
        documentTypes1.setId(123L);

        ApprovalRequest approvalRequest1 = new ApprovalRequest();
        approvalRequest1.setApprovalStep("Approval Step");
        approvalRequest1.setApproved(true);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest1.setCreatedAt(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest1.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest1.setDescription("The characteristics of someone or something");
        approvalRequest1.setDocumentType(documentTypes1);
        approvalRequest1.setEmailAddress("42 Main St");
        approvalRequest1.setFirstName("Jane");
        approvalRequest1.setIDNumber("42");
        approvalRequest1.setId(123L);
        approvalRequest1.setLastName("Doe");
        approvalRequest1.setPhoneNumber("4105551212");
        approvalRequest1.setRequestId("42");
        assertSame(approvalRequest, approvalRequestController.makeApprovalRequest(approvalRequest1));
        verify(approvalRequestService).makeApprovalRequest((ApprovalRequest) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#getApprovalRequests(Boolean)}
     */
    @Test
    void testGetApprovalRequests() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        ApprovalRequestRepository approvalRequestRepository = mock(ApprovalRequestRepository.class);
        ArrayList<Optional<ApprovalRequest>> optionalList = new ArrayList<>();
        when(approvalRequestRepository.getApprovalrequestByStatus((Boolean) any())).thenReturn(optionalList);
        List<Optional<ApprovalRequest>> actualApprovalRequests = (new ApprovalRequestController(
                new ApprovalRequestService(approvalRequestRepository))).getApprovalRequests(true);
        assertSame(optionalList, actualApprovalRequests);
        assertTrue(actualApprovalRequests.isEmpty());
        verify(approvalRequestRepository).getApprovalrequestByStatus((Boolean) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#getApprovalRequests(Boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApprovalRequests2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.ApprovalRequestService.getApprovalRequests(java.lang.Boolean)" because "this.approvalRequestService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.ApprovalRequestController.getApprovalRequests(ApprovalRequestController.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new ApprovalRequestController(null)).getApprovalRequests(true);
    }

    /**
     * Method under test: {@link ApprovalRequestController#getApprovalRequests(Boolean)}
     */
    @Test
    void testGetApprovalRequests3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        ApprovalRequestService approvalRequestService = mock(ApprovalRequestService.class);
        ArrayList<Optional<ApprovalRequest>> optionalList = new ArrayList<>();
        when(approvalRequestService.getApprovalRequests((Boolean) any())).thenReturn(optionalList);
        List<Optional<ApprovalRequest>> actualApprovalRequests = (new ApprovalRequestController(approvalRequestService))
                .getApprovalRequests(true);
        assertSame(optionalList, actualApprovalRequests);
        assertTrue(actualApprovalRequests.isEmpty());
        verify(approvalRequestService).getApprovalRequests((Boolean) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#approveOrReject(ApproveAction)}
     */
    @Test
    void testApproveOrReject() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setApprovalStep("Approval Step");
        approvalRequest.setApproved(true);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest.setDescription("The characteristics of someone or something");
        approvalRequest.setDocumentType(documentTypes);
        approvalRequest.setEmailAddress("42 Main St");
        approvalRequest.setFirstName("Jane");
        approvalRequest.setIDNumber("42");
        approvalRequest.setId(123L);
        approvalRequest.setLastName("Doe");
        approvalRequest.setPhoneNumber("4105551212");
        approvalRequest.setRequestId("42");
        ApprovalRequestRepository approvalRequestRepository = mock(ApprovalRequestRepository.class);
        when(approvalRequestRepository.findById((Long) any())).thenReturn(Optional.of(approvalRequest));
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(
                new ApprovalRequestService(approvalRequestRepository));
        ApprovalRequest actualApproveOrRejectResult = approvalRequestController.approveOrReject(new ApproveAction());
        assertSame(approvalRequest, actualApproveOrRejectResult);
        assertFalse(actualApproveOrRejectResult.getApproved());
        verify(approvalRequestRepository).findById((Long) any());
    }

    /**
     * Method under test: {@link ApprovalRequestController#approveOrReject(ApproveAction)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testApproveOrReject2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: The Approval Request  with Id null does Not exist.
        //       at com.prestacapital.WorkflowAutomator.service.ApprovalRequestService.lambda$approveOrReject$0(ApprovalRequestService.java:39)
        //       at java.util.Optional.orElseThrow(Optional.java:403)
        //       at com.prestacapital.WorkflowAutomator.service.ApprovalRequestService.approveOrReject(ApprovalRequestService.java:39)
        //       at com.prestacapital.WorkflowAutomator.controller.ApprovalRequestController.approveOrReject(ApprovalRequestController.java:35)
        //   See https://diff.blue/R013 to resolve this issue.

        ApprovalRequestRepository approvalRequestRepository = mock(ApprovalRequestRepository.class);
        when(approvalRequestRepository.findById((Long) any())).thenReturn(Optional.empty());
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(
                new ApprovalRequestService(approvalRequestRepository));
        approvalRequestController.approveOrReject(new ApproveAction());
    }

    /**
     * Method under test: {@link ApprovalRequestController#approveOrReject(ApproveAction)}
     */
    @Test
    void testApproveOrReject3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);

        ApprovalRequest approvalRequest = new ApprovalRequest();
        approvalRequest.setApprovalStep("Approval Step");
        approvalRequest.setApproved(true);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        approvalRequest.setCreatedAt(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        approvalRequest.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        approvalRequest.setDescription("The characteristics of someone or something");
        approvalRequest.setDocumentType(documentTypes);
        approvalRequest.setEmailAddress("42 Main St");
        approvalRequest.setFirstName("Jane");
        approvalRequest.setIDNumber("42");
        approvalRequest.setId(123L);
        approvalRequest.setLastName("Doe");
        approvalRequest.setPhoneNumber("4105551212");
        approvalRequest.setRequestId("42");
        ApprovalRequestService approvalRequestService = mock(ApprovalRequestService.class);
        when(approvalRequestService.approveOrReject((ApproveAction) any())).thenReturn(approvalRequest);
        ApprovalRequestController approvalRequestController = new ApprovalRequestController(approvalRequestService);
        assertSame(approvalRequest, approvalRequestController.approveOrReject(new ApproveAction()));
        verify(approvalRequestService).approveOrReject((ApproveAction) any());
    }
}

