package com.appfinder.data.assets;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssetsRepository extends JpaRepository<Assets, Integer> {
    List<Assets> findByCategory(String category);
}
