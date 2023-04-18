package com.prestacapital.WorkflowAutomator.service;

import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import com.prestacapital.WorkflowAutomator.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService {
    private final DocumentTypeRepository documentTypeRepository;

    @Autowired
    public DocumentTypeService(DocumentTypeRepository documentTypeRepository) {
        this.documentTypeRepository = documentTypeRepository;
    }

    public DocumentTypes addNewDocumentType(DocumentTypes documentTypes) {
        return documentTypeRepository.save(documentTypes);
    }

    public List<DocumentTypes> getDocumentType() {
        return documentTypeRepository.getDocumentType();
    }
}
