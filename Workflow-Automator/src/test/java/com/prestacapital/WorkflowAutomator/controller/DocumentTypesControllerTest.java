package com.prestacapital.WorkflowAutomator.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import com.prestacapital.WorkflowAutomator.repository.DocumentTypeRepository;
import com.prestacapital.WorkflowAutomator.service.DocumentTypeService;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DocumentTypesControllerTest {
    /**
     * Method under test: {@link DocumentTypesController#addNewDocumentType(DocumentTypes)}
     */
    @Test
    void testAddNewDocumentType() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);
        DocumentTypeRepository documentTypeRepository = mock(DocumentTypeRepository.class);
        when(documentTypeRepository.save((DocumentTypes) any())).thenReturn(documentTypes);
        DocumentTypesController documentTypesController = new DocumentTypesController(
                new DocumentTypeService(documentTypeRepository));

        DocumentTypes documentTypes1 = new DocumentTypes();
        documentTypes1.setDocumentTypeDescription("Document Description");
        documentTypes1.setDocumentTypeId("42");
        documentTypes1.setDocumentTypeName("Document Name");
        documentTypes1.setId(123L);
        assertSame(documentTypes, documentTypesController.addNewDocumentType(documentTypes1));
        verify(documentTypeRepository).save((DocumentTypes) any());
    }

    /**
     * Method under test: {@link DocumentTypesController#addNewDocumentType(DocumentTypes)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddNewDocumentType2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.DocumentTypeService.addNewDocumentType(com.prestacapital.WorkflowAutomator.entity.DocumentTypes)" because "this.documentTypeService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.DocumentTypesController.addNewDocumentType(DocumentTypesController.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        DocumentTypesController documentTypesController = new DocumentTypesController(null);

        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setDocumentTypeDescription("Document Description");
        documentTypes.setDocumentTypeId("42");
        documentTypes.setDocumentTypeName("Document Name");
        documentTypes.setId(123L);
        documentTypesController.addNewDocumentType(documentTypes);
    }

    /**
     * Method under test: {@link DocumentTypesController#getDocumentType()}
     */
    @Test
    void testGetDocumentType() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        DocumentTypeRepository documentTypeRepository = mock(DocumentTypeRepository.class);
        ArrayList<DocumentTypes> optionalList = new ArrayList<>();
        when(documentTypeRepository.getDocumentType()).thenReturn(optionalList);
        List<DocumentTypes> actualDocumentType = (new DocumentTypesController(
                new DocumentTypeService(documentTypeRepository))).getDocumentType();
        assertSame(optionalList, actualDocumentType);
        assertTrue(actualDocumentType.isEmpty());
        verify(documentTypeRepository).getDocumentType();
    }

    /**
     * Method under test: {@link DocumentTypesController#getDocumentType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDocumentType2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.prestacapital.WorkflowAutomator.service.DocumentTypeService.getDocumentType()" because "this.documentTypeService" is null
        //       at com.prestacapital.WorkflowAutomator.controller.DocumentTypesController.getDocumentType(DocumentTypesController.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        (new DocumentTypesController(null)).getDocumentType();
    }
}

