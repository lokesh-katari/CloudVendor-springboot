package com.example.demomaven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demomaven.exception.CloudVendorNotfoundException;
import com.example.demomaven.model.CloudVendor;
import com.example.demomaven.repository.CloudVendorRepo;
import com.example.demomaven.service.CloudVendorService;

@Service
public class CloudVendorImpl implements CloudVendorService {
    @Autowired
    CloudVendorRepo cloudVendorRepo;

    @Override
    public String createVendor(CloudVendor cloudvendor) {
        // TODO Auto-generated method stub
        cloudVendorRepo.save(cloudvendor);
        return "success";
    }

    @Override
    public CloudVendor getVendor(String Vid) {
        // TODO Auto-generated method stub

        if (cloudVendorRepo.findById(Vid).isEmpty()) {

            throw new CloudVendorNotfoundException("Cloud Vendor does not in the  existing database");
        }
        return cloudVendorRepo.findById(Vid).get();

    }

    @Override
    public String deleteVendor(String cloudvendorId) {
        // TODO Auto-generated method stub
        cloudVendorRepo.deleteById(cloudvendorId);
        return "deleted";
    }

    @Override
    public List<CloudVendor> getallVendors() {
        // TODO Auto-generated method stub
        return cloudVendorRepo.findAll();
    }

    @Override
    public String updateVendor(CloudVendor cloudvendor) {
        // TODO Auto-generated method stub
        cloudVendorRepo.save(cloudvendor);
        return "success";
    }

}
