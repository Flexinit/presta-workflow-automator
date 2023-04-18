package com.prestacapital.WorkflowAutomator.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class DocumentTypes {
    @Id
    @SequenceGenerator(
            name = "doc_sequence",
            sequenceName = "doc_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.UUID,
            generator = "doc_sequence"
    )
    public Long id;
    public String documentId;
    public String documentName;
    public String documentDescription;

}
