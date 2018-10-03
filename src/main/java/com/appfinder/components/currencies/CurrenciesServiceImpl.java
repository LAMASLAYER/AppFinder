package com.appfinder.components.currencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrenciesServiceImpl implements CurrenciesService {


    private final CurrenciesRepository currenciesRepository;

    @Autowired
    public CurrenciesServiceImpl(CurrenciesRepository currenciesRepository) {
        this.currenciesRepository = currenciesRepository;
    }

    @Override
    public Currencies getCurrencyById(Integer currencyId) {
        return currenciesRepository.findOne(currencyId);
    }

    @Override
    public void saveCurrency(Currencies currency) {
        currenciesRepository.save(currency);
    }

    @Override
    public List<Currencies> getAllCurrencies() {
        return currenciesRepository.findAll();
    }

    @Override
    public Currencies getCurrencyByName(String name) { return currenciesRepository.findByName(name); }


}
