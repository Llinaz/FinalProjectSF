package org.example.finalprojectsf.service;


import org.example.finalprojectsf.model.Account;
import org.example.finalprojectsf.operation.Operation;
import org.example.finalprojectsf.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OperationService {

    @Autowired
    private OperationRepository operationRepository;

    public List<Operation> getOperationList(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        return operationRepository.findAllByUserId(userId, startDate, endDate);
    }

    @Transactional
    public Operation insertOperation(int userId, int operationType, int amount) {
        Account account = new Account();
        account.setId(userId);
        Operation operation = new Operation();
//        operation.setUser(account);
        operation.setOperationType(operationType);
        operation.setAmount(amount);
        operation.setOperationDate(LocalDateTime.now());
        return operationRepository.save(operation);
    }
}