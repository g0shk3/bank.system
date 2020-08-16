package com.bank.bank.system.service;

import com.bank.bank.system.exeption.NoResultsFoundException;
import com.bank.bank.system.model.Address;
import com.bank.bank.system.model.Bank;
import com.bank.bank.system.repository.AddressRepository;
import com.bank.bank.system.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class   BankServiceImpl implements BankService{

    private final BankRepository bankRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository, AddressRepository addressRepository) {
        this.bankRepository = bankRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void createBank(Bank bank) {

        validateBank(bank);

        if(null == bank.getAddress().getId()){
            Address addressReference = bankRepository.getReference(bank.getAddress().getId(), Address.class);
            bank.setAddress(addressReference);
            addressRepository.save(bank.getAddress());
        }else{
            addressRepository.save(bank.getAddress());
        }
        bankRepository.save(bank);
    }

    @Override
    public void updateBank(Bank bank) {

    }

    @Override
    public Iterable<Bank> getAllBanks() {
        return null;
    }

    @Override
    public Bank getBankById(Long bankId) {
        Optional<Bank> bankEntity = bankRepository.findById(bankId);

        if (bankEntity.isPresent()){
            return bankEntity.get();
        }

        throw new NoResultsFoundException();
    }

    @Override
    public void deleteBankById(Long bankId) {

    }

    private void validateBank(Bank bank) {
        if (null == bank.getAddress()) {
            throw new IllegalArgumentException("Invalid address");

        }
    }
}
