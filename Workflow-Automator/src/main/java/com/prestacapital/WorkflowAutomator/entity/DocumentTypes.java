package com.prestacapital.WorkflowAutomator.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
            strategy = GenerationType.AUTO,
            generator = "doc_sequence"
    )
    public Long id;
    public String documentId;
    public String documentName;
    public String documentDescription;

}
