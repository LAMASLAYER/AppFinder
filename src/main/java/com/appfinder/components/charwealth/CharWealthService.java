package com.appfinder.components.charwealth;


public interface CharWealthService {
    CharWealth getByCharId(Integer charId);
    void saveCharWealth(CharWealth charWealth);
}
