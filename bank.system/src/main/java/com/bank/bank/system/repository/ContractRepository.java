package com.bank.bank.system.repository;

import com.bank.bank.system.model.conract.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository <Contract, Long> {
}
