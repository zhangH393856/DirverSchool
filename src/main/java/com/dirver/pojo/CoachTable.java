package com.dirver.pojo;

import java.math.BigDecimal;

public class CoachTable {
    private Integer coachId;

    private String coachName;

    private String coachMyfile;

    private String coachCarfile;

    private String coachCartype;

    private String coachPhone;

    private String coachStartime;

    private String coachEndtime;

    private BigDecimal coachSalary;

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName == null ? null : coachName.trim();
    }

    public String getCoachMyfile() {
        return coachMyfile;
    }

    public void setCoachMyfile(String coachMyfile) {
        this.coachMyfile = coachMyfile == null ? null : coachMyfile.trim();
    }

    public String getCoachCarfile() {
        return coachCarfile;
    }

    public void setCoachCarfile(String coachCarfile) {
        this.coachCarfile = coachCarfile == null ? null : coachCarfile.trim();
    }

    public String getCoachCartype() {
        return coachCartype;
    }

    public void setCoachCartype(String coachCartype) {
        this.coachCartype = coachCartype == null ? null : coachCartype.trim();
    }

    public String getCoachPhone() {
        return coachPhone;
    }

    public void setCoachPhone(String coachPhone) {
        this.coachPhone = coachPhone == null ? null : coachPhone.trim();
    }

    public String getCoachStartime() {
        return coachStartime;
    }

    public void setCoachStartime(String coachStartime) {
        this.coachStartime = coachStartime == null ? null : coachStartime.trim();
    }

    public String getCoachEndtime() {
        return coachEndtime;
    }

    public void setCoachEndtime(String coachEndtime) {
        this.coachEndtime = coachEndtime == null ? null : coachEndtime.trim();
    }

    public BigDecimal getCoachSalary() {
        return coachSalary;
    }

    public void setCoachSalary(BigDecimal coachSalary) {
        this.coachSalary = coachSalary;
    }
}