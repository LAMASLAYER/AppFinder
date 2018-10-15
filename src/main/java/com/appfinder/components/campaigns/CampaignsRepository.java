package com.appfinder.components.campaigns;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CampaignsRepository extends JpaRepository<Campaigns, Integer> {
    Campaigns findByName(String name);
    List<Campaigns> findByGmId(int id);

}
