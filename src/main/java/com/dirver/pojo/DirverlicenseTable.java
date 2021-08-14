package com.dirver.pojo;

public class DirverlicenseTable {
    private Integer licenseId;

    private String licenseUsername;

    private String licensePhone;

    private String licenseUserid;

    private String licenseCartype;

    private String licenseTime;

    public Integer getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseUsername() {
        return licenseUsername;
    }

    public void setLicenseUsername(String licenseUsername) {
        this.licenseUsername = licenseUsername == null ? null : licenseUsername.trim();
    }

    public String getLicensePhone() {
        return licensePhone;
    }

    public void setLicensePhone(String licensePhone) {
        this.licensePhone = licensePhone == null ? null : licensePhone.trim();
    }

    public String getLicenseUserid() {
        return licenseUserid;
    }

    public void setLicenseUserid(String licenseUserid) {
        this.licenseUserid = licenseUserid == null ? null : licenseUserid.trim();
    }

    public String getLicenseCartype() {
        return licenseCartype;
    }

    public void setLicenseCartype(String licenseCartype) {
        this.licenseCartype = licenseCartype == null ? null : licenseCartype.trim();
    }

    public String getLicenseTime() {
        return licenseTime;
    }

    public void setLicenseTime(String licenseTime) {
        this.licenseTime = licenseTime == null ? null : licenseTime.trim();
    }
}