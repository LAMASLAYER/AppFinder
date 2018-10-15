package com.appfinder.components.campaigns;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/campaigns")
public class CampaignsController {

    private static final Logger LOGGER = Logger.getLogger(CampaignsController.class);

    private final CampaignsRepository campaignsRepository;
    private final CampaignsService campaignsService;

    @Autowired
    public CampaignsController(CampaignsRepository campaignsRepository, CampaignsService campaignsService) {
        this.campaignsRepository = campaignsRepository;
        this.campaignsService = campaignsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Campaigns> getAllCampaigns() {
        LOGGER.info("Retrieving Campaigns...");
        return campaignsRepository.findAll();
    }

    @GetMapping(path = "/campaignId/{campaignId}")
    public Campaigns getCampaignsById(@PathVariable int campaignId) {
        LOGGER.info("Retrieving campaigns with the id: " + campaignId);
        return campaignsService.getCampaignById(campaignId);
    }

    @PostMapping(path = "/post")
    public void saveCampaign(@RequestBody Campaigns campaign) {
            campaignsService.saveCampaign(campaign);
    }

    @GetMapping(path = "/name/{name}")
    public Campaigns getCampaignsByName(@PathVariable String name) {
        LOGGER.info("Retrieving campaigns with the name: " + name);
        return campaignsService.getCampaignByName(name);
    }

    @GetMapping(path = "/gmId/{gmId}")
    public List<Campaigns> getByGmId(@PathVariable int gmId) {
        LOGGER.info("Retrieving campaigns with the gm: " + gmId);
        return campaignsService.getByGmId(gmId);
    }

}
