package com.prestacapital.WorkflowAutomator.repository;

import com.prestacapital.WorkflowAutomator.entity.Approvers;
import com.prestacapital.WorkflowAutomator.entity.DocumentTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApproversRepository extends JpaRepository<Approvers, Long> {
    @Query("SELECT * FROM Approvers a WHERE a.documentType = ?")
    List<Optional<Approvers>> getApproverByDocumentType(DocumentTypes documentType);
}
