package com.example.demomaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demomaven.model.CloudVendor;

@Repository
public interface CloudVendorRepo extends JpaRepository<CloudVendor, String> {

}
