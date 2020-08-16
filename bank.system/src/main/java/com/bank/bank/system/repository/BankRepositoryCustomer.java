package com.bank.bank.system.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface BankRepositoryCustomer {

    <T> T getReference(Long id , Class<T> tClass);
}
