package com.example.demomaven.service;

import java.util.List;

import com.example.demomaven.model.CloudVendor;

public interface CloudVendorService {
    public String createVendor(CloudVendor cloudvendor);

    public String updateVendor(CloudVendor cloudvendor);

    public String deleteVendor(String cloudvendorId);

    public CloudVendor getVendor(String cloudvendorId);

    public List<CloudVendor> getallVendors();
}
