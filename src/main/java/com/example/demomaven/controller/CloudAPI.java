package com.example.demomaven.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomaven.model.CloudVendor;
import com.example.demomaven.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendors")
public class CloudAPI {

    CloudVendorService cloudVendorService;

    public CloudAPI(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{Vid}")
    public CloudVendor getVendorDetails(@PathVariable("Vid") String Vid) {

        return cloudVendorService.getVendor(Vid);
    }

    @GetMapping("/allVendors")
    public List<CloudVendor> getallVendorDetails() {
        return cloudVendorService.getallVendors();

    }

    @PostMapping("/createVendor")
    public String postCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createVendor(cloudVendor);
        return "success";

    }

    @PutMapping("/updateVendor/{Vid}")
    public CloudVendor updateCloudVendor(@RequestBody CloudVendor cloudVendor, @PathVariable String Vid) {
        cloudVendorService.updateVendor(cloudVendor);
        return cloudVendor;

    }
}
