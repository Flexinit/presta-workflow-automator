package com.prestacapital.WorkflowAutomator.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table
public class ApprovalRequest {
    @Id
    @SequenceGenerator(
            name = "approval_sequence",
            sequenceName = "approval_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "approval_sequence"
    )
    public Long id;
    public String requestId; //Used for tracking by requesting entity
    @ManyToOne
    @JoinColumn(name = "document_type_id")
    public DocumentTypes documentType;
    public String firstName;
    public String LastName;
    public String approvalStep;
    public String phoneNumber;
    public String emailAddress;
    public Boolean approved;
    public String IDNumber;
    public String description;
    public Date createdAt;
    public String createdBy;

    public DocumentTypes getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypes documentType) {
        this.documentType = documentType;
    }


}
