package com.example.demomaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    private String Vid;
    private String Vname;
    private String Vphone;
    private String Vaddrs;

    public String getVname() {
        return Vname;
    }

    public void setVname(String vname) {
        Vname = vname;
    }

    public String getVid() {
        return Vid;
    }

    public void setVid(String vid) {
        Vid = vid;
    }

    public String getVphone() {
        return Vphone;
    }

    public void setVphone(String vphone) {
        Vphone = vphone;
    }

    public String getVaddrs() {
        return Vaddrs;
    }

    public void setVaddrs(String vaddrs) {
        Vaddrs = vaddrs;
    }

    public CloudVendor() {
    }

    public CloudVendor(String vname, String vid, String vphone, String vaddrs) {
        Vname = vname;
        Vid = vid;
        Vphone = vphone;
        Vaddrs = vaddrs;
    }

}
