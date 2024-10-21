package org.example.finalprojectsf.repository;

import org.example.finalprojectsf.model.Account;
import org.example.finalprojectsf.operation.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {
    List<Operation> findAllByUserId(int userId, LocalDateTime startDate, LocalDateTime endDate);
    Operation save(Operation operation);
}
