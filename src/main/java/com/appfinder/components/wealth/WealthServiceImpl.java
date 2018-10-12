package com.appfinder.components.wealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WealthServiceImpl implements WealthService {


    private final WealthRepository wealthRepository;

    @Autowired
    public WealthServiceImpl(WealthRepository wealthRepository) {
        this.wealthRepository = wealthRepository;
    }

    @Override
    public Wealth getWealthById(Integer wealthId) {
        return wealthRepository.findOne(wealthId);
    }

    @Override
    public void saveWealth(Wealth wealth) {
        wealthRepository.save(wealth);
    }

    @Override
    public List<Wealth> getAllWealth() {
        return wealthRepository.findAll();
    }

}
