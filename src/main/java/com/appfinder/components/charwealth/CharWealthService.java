package com.appfinder.components.charwealth;


import java.util.List;

public interface CharWealthService {
    CharWealth getByCharId(Integer charId);
    void saveCharWealth(CharWealth charWealth);
}
