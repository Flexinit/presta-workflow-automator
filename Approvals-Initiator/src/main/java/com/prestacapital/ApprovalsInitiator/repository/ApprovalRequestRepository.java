package com.prestacapital.ApprovalsInitiator.repository;

import com.prestacapital.WorkflowAutomator.entity.ApprovalRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApprovalRequestRepository extends JpaRepository<ApprovalRequest, Long> {

    @Query("SELECT * FROM ApprovalRequest r WHERE r.approved = ?")
    List<Optional<ApprovalRequest>> getApprovalrequestByStatus(Boolean approved);



}
