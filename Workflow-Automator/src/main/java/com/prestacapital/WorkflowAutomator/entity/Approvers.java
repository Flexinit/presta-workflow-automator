package com.prestacapital.WorkflowAutomator.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table
public class Approvers {
    @Id
    @SequenceGenerator(
            name = "approver_sequence",
            sequenceName = "approver_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "approver_sequence"
    )

    public Long id;
    public String approverId;
    public String firstName;
    public String lastName;
    public String emailAddress;
    public String phoneNumber;
    public String designation;
    @ManyToOne
    @JoinColumn(name = "document_type_id")
    public DocumentTypes documentType;

}
