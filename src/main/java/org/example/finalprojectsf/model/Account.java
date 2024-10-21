package org.example.finalprojectsf.model;

import jakarta.persistence.*;


@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int balance;

    public Account() {}

    public Account(Integer id,Integer balance) {
        this.id = id;
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account { id=" + id + ", balance=" + balance + "}";
    }
}
