package com.bank.bank.system.repository;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class BankRepositoryCustomerImpl implements BankRepositoryCustomer{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public <T> T getReference(Long id, Class<T> tClass) {
        return entityManager.getReference(tClass, id);
    }
}
