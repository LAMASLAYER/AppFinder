package com.appfinder.components.currencies;

import java.util.List;

public interface CurrenciesService {
    Currencies getCurrencyById(Integer currencyId);
    void saveCurrency(Currencies currency);
    List<Currencies> getAllCurrencies();
    Currencies getCurrencyByName(String name);
}
