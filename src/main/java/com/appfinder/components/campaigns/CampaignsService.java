package com.appfinder.components.campaigns;

import java.util.List;

public interface CampaignsService {
    Campaigns getCampaignById(Integer campaignId);
    void saveCampaign(Campaigns campaign);
    List<Campaigns> getAllCampaigns();
    Campaigns getCampaignByName(String name);
    List<Campaigns> getByGmId(int id);
}
