package org.example.finalprojectsf.operation;


import jakarta.persistence.*;
import org.example.finalprojectsf.model.Account;

import java.time.LocalDateTime;

@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Account account;
    private int operationType;
    private int amount;
    private LocalDateTime operationDate;

    public Operation(int id,  int operationType, int amount, LocalDateTime operationDate) {
        this.id = id;
        this.operationType = operationType;
        this.amount = amount;
        this.operationDate = operationDate;
    }

    public Operation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }
}