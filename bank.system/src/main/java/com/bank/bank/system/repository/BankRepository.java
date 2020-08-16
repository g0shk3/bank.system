package com.bank.bank.system.repository;

import com.bank.bank.system.model.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<Bank, Long>, BankRepositoryCustomer, PagingAndSortingRepository<Bank, Long> {
}
