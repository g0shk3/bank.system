package com.bank.bank.system.service;

import com.bank.bank.system.model.conract.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {

    void createContract(Contract contract);

    void updateContract(Contract contract);

    List<Contract> getAllContract();

    Contract getContractById(Long contractId);

    void deleteContractById(Long contractId);
}
