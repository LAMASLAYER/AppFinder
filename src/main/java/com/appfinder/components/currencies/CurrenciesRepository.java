package com.appfinder.components.currencies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrenciesRepository extends JpaRepository<Currencies, Integer> {
    Currencies findByName(String name);
}
