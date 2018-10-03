package com.appfinder.components.currencies;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/currencies")
public class CurrenciesController {

    private static final Logger LOGGER = Logger.getLogger(CurrenciesController.class);

    private final CurrenciesRepository currenciesRepository;
    private final CurrenciesService currenciesService;

    @Autowired
    public CurrenciesController(CurrenciesRepository currenciesRepository, CurrenciesService currenciesService) {
        this.currenciesRepository = currenciesRepository;
        this.currenciesService = currenciesService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Currencies> getAllCurrencies() {
        LOGGER.info("Retrieving currencies...");
        return currenciesRepository.findAll();
    }



    @GetMapping(path = "/currencyid/{currencyId}")
    public Currencies getCurrencyById(@PathVariable int currencyId) {
        LOGGER.info("Retrieving Currency with the id: " + currencyId);
        return currenciesService.getCurrencyById(currencyId);
    }

    @PostMapping(path = "/post")
    public void saveCurrency(@RequestBody Currencies currency) {
        LOGGER.info("Saving Currency " + currency);
        currenciesService.saveCurrency(currency);
    }

    @GetMapping(path = "/name/{name}")
    public Currencies getCurrencyByName(@PathVariable String name) {
        LOGGER.info("Retrieving Currency with the name: " + name);
        return currenciesService.getCurrencyByName(name);
    }
}
