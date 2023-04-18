package com.prestacapital.WorkflowAutomator.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.prestacapital.WorkflowAutomator.entity.Approvers;
import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import com.prestacapital.WorkflowAutomator.repository.ApprovalRequestRepository;
import com.prestacapital.WorkflowAutomator.repository.ApproversRepository;
import com.prestacapital.WorkflowAutomator.service.ApproversService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ApproversControllerTest {
    /**
     * Method under test: {@link ApproversController#addNewApprover(Approvers)}
     */
    @Test
    void testAddNewApprover() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);

        Approvers approvers = new Approvers();
        approvers.setApproverId("42");
        approvers.setDesignation("Designation");
        approvers.setDocumentType(documentTypes);
        approvers.setEmailAddress("42 Main St");
        approvers.setFirstName("Jane");
        approvers.setId(123L);
        approvers.setLastName("Doe");
        approvers.setPhoneNumber("4105551212");
        ApproversRepository approversRepository = mock(ApproversRepository.class);
        when(approversRepository.save((Approvers) any())).thenReturn(approvers);
        ApproversController approversController = new ApproversController(
                new ApproversService(approversRepository, mock(ApprovalRequestRepository.class)));

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentDescription("Document Description");
        documentTypes1.setDocumentId("42");
        documentTypes1.setDocumentName("Document Name");
        documentTypes1.setId(123L);

        Approvers approvers1 = new Approvers();
        approvers1.setApproverId("42");
        approvers1.setDesignation("Designation");
        approvers1.setDocumentType(documentTypes1);
        approvers1.setEmailAddress("42 Main St");
        approvers1.setFirstName("Jane");
        approvers1.setId(123L);
        approvers1.setLastName("Doe");
        approvers1.setPhoneNumber("4105551212");
        assertSame(approvers, approversController.addNewApprover(approvers1));
        verify(approversRepository).save((Approvers) any());
    }

    /**
     * Method under test: {@link ApproversController#addNewApprover(Approvers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddNewApprover2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.ApproversService.addNewApprover(com.prestacapital.WorkflowAutomator.entity.Approvers)" because "this.approversService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.ApproversController.addNewApprover(ApproversController.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        ApproversController approversController = new ApproversController(null);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);

        Approvers approvers = new Approvers();
        approvers.setApproverId("42");
        approvers.setDesignation("Designation");
        approvers.setDocumentType(documentTypes);
        approvers.setEmailAddress("42 Main St");
        approvers.setFirstName("Jane");
        approvers.setId(123L);
        approvers.setLastName("Doe");
        approvers.setPhoneNumber("4105551212");
        approversController.addNewApprover(approvers);
    }

    /**
     * Method under test: {@link ApproversController#addNewApprover(Approvers)}
     */
    @Test
    void testAddNewApprover3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);

        Approvers approvers = new Approvers();
        approvers.setApproverId("42");
        approvers.setDesignation("Designation");
        approvers.setDocumentType(documentTypes);
        approvers.setEmailAddress("42 Main St");
        approvers.setFirstName("Jane");
        approvers.setId(123L);
        approvers.setLastName("Doe");
        approvers.setPhoneNumber("4105551212");
        ApproversService approversService = mock(ApproversService.class);
        when(approversService.addNewApprover((Approvers) any())).thenReturn(approvers);
        ApproversController approversController = new ApproversController(approversService);

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentDescription("Document Description");
        documentTypes1.setDocumentId("42");
        documentTypes1.setDocumentName("Document Name");
        documentTypes1.setId(123L);

        Approvers approvers1 = new Approvers();
        approvers1.setApproverId("42");
        approvers1.setDesignation("Designation");
        approvers1.setDocumentType(documentTypes1);
        approvers1.setEmailAddress("42 Main St");
        approvers1.setFirstName("Jane");
        approvers1.setId(123L);
        approvers1.setLastName("Doe");
        approvers1.setPhoneNumber("4105551212");
        assertSame(approvers, approversController.addNewApprover(approvers1));
        verify(approversService).addNewApprover((Approvers) any());
    }

    /**
     * Method under test: {@link ApproversController#getApproverByDocumentType(DocumentTypes)}
     */
    @Test
    void testGetApproverByDocumentType() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        ApproversRepository approversRepository = mock(ApproversRepository.class);
        ArrayList<Optional<Approvers>> optionalList = new ArrayList<>();
        when(approversRepository.getApproverByDocumentType((DocumentTypes) any())).thenReturn(optionalList);
        ApproversController approversController = new ApproversController(
                new ApproversService(approversRepository, mock(ApprovalRequestRepository.class)));

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);
        List<Optional<Approvers>> actualApproverByDocumentType = approversController
                .getApproverByDocumentType(documentTypes);
        assertSame(optionalList, actualApproverByDocumentType);
        assertTrue(actualApproverByDocumentType.isEmpty());
        verify(approversRepository).getApproverByDocumentType((DocumentTypes) any());
    }

    /**
     * Method under test: {@link ApproversController#getApproverByDocumentType(DocumentTypes)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApproverByDocumentType2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.ApproversService.getApproverByDocumentType(com.prestacapital.WorkflowAutomator.entity.DocumentTypes)" because "this.approversService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.ApproversController.getApproverByDocumentType(ApproversController.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        ApproversController approversController = new ApproversController(null);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);
        approversController.getApproverByDocumentType(documentTypes);
    }

    /**
     * Method under test: {@link ApproversController#getApproverByDocumentType(DocumentTypes)}
     */
    @Test
    void testGetApproverByDocumentType3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        ApproversService approversService = mock(ApproversService.class);
        ArrayList<Optional<Approvers>> optionalList = new ArrayList<>();
        when(approversService.getApproverByDocumentType((DocumentTypes) any())).thenReturn(optionalList);
        ApproversController approversController = new ApproversController(approversService);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentDescription("Document Description");
        documentTypes.setDocumentId("42");
        documentTypes.setDocumentName("Document Name");
        documentTypes.setId(123L);
        List<Optional<Approvers>> actualApproverByDocumentType = approversController
                .getApproverByDocumentType(documentTypes);
        assertSame(optionalList, actualApproverByDocumentType);
        assertTrue(actualApproverByDocumentType.isEmpty());
        verify(approversService).getApproverByDocumentType((DocumentTypes) any());
    }
}

