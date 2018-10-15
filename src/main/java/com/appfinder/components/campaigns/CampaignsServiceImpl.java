package com.appfinder.components.campaigns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignsServiceImpl implements CampaignsService {


    private final CampaignsRepository campaignsRepository;

    @Autowired
    public CampaignsServiceImpl(CampaignsRepository campaignsRepository) {
        this.campaignsRepository = campaignsRepository;
    }

    @Override
    public Campaigns getCampaignById(Integer campaignId) {
        return campaignsRepository.findOne(campaignId);
    }

    @Override
    public void saveCampaign(Campaigns campaign) {
        campaignsRepository.save(campaign);
    }

    @Override
    public List<Campaigns> getAllCampaigns() {
        return campaignsRepository.findAll();
    }

    @Override
    public Campaigns getCampaignByName(String name) { return campaignsRepository.findByName(name); }

    @Override
    public List<Campaigns> getByGmId(int id) { return campaignsRepository.findByGmId(id); }

}
