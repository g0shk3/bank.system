package com.bank.bank.system.service;

import com.bank.bank.system.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    void createAddress();

    void updateAddress(Address address);

    Address getAddressById(Long addressId);

    List<Address> getAllAddress();

    void deleteAddressById(Long addressId);

}
