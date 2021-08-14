package com.dirver.pojo;

public class SignupTable {
    private Integer signupId;

    private String signupName;

    private String signupCartype;

    private String signupCoachname;

    private String signupCoachphone;

    private String signupPhone;

    private String signupTime;

    public Integer getSignupId() {
        return signupId;
    }

    public void setSignupId(Integer signupId) {
        this.signupId = signupId;
    }

    public String getSignupName() {
        return signupName;
    }

    public void setSignupName(String signupName) {
        this.signupName = signupName == null ? null : signupName.trim();
    }

    public String getSignupCartype() {
        return signupCartype;
    }

    public void setSignupCartype(String signupCartype) {
        this.signupCartype = signupCartype == null ? null : signupCartype.trim();
    }

    public String getSignupCoachname() {
        return signupCoachname;
    }

    public void setSignupCoachname(String signupCoachname) {
        this.signupCoachname = signupCoachname == null ? null : signupCoachname.trim();
    }

    public String getSignupCoachphone() {
        return signupCoachphone;
    }

    public void setSignupCoachphone(String signupCoachphone) {
        this.signupCoachphone = signupCoachphone == null ? null : signupCoachphone.trim();
    }

    public String getSignupPhone() {
        return signupPhone;
    }

    public void setSignupPhone(String signupPhone) {
        this.signupPhone = signupPhone == null ? null : signupPhone.trim();
    }

    public String getSignupTime() {
        return signupTime;
    }

    public void setSignupTime(String signupTime) {
        this.signupTime = signupTime == null ? null : signupTime.trim();
    }
}