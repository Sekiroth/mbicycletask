package com.mbicycle.interviewtask.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction_data")
public class TransactionData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tKey;
    private String tValue;
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    public TransactionData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettKey() {
        return tKey;
    }

    public void settKey(String tKey) {
        this.tKey = tKey;
    }

    public String gettValue() {
        return tValue;
    }

    public void settValue(String tValue) {
        this.tValue = tValue;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
