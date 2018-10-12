package com.appfinder.components.wealth;

import java.util.List;

public interface WealthService {
    Wealth getWealthById(Integer wealthId);
    void saveWealth(Wealth wealth);
    List<Wealth> getAllWealth();
}
