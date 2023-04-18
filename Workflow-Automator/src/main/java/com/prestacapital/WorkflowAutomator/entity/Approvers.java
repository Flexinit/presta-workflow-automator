package com.prestacapital.WorkflowAutomator.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


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
            strategy = GenerationType.UUID,
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
