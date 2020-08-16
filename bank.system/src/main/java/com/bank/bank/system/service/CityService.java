package com.bank.bank.system.service;

import com.bank.bank.system.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    void createCity(City city);

    void updateCity(City city);

    List<City> getAllCity();

    City getCityById(Long cityId);

    void deleteCityById(Long cityId);
}
