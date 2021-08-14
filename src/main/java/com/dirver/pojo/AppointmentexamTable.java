package com.dirver.pojo;

public class AppointmentexamTable {
    private Integer appointmentId;

    private String appointmentUsername;

    private String appointmentCartype;

    private String appointmentProjecttype;

    private String appointmentTime;

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentUsername() {
        return appointmentUsername;
    }

    public void setAppointmentUsername(String appointmentUsername) {
        this.appointmentUsername = appointmentUsername == null ? null : appointmentUsername.trim();
    }

    public String getAppointmentCartype() {
        return appointmentCartype;
    }

    public void setAppointmentCartype(String appointmentCartype) {
        this.appointmentCartype = appointmentCartype == null ? null : appointmentCartype.trim();
    }

    public String getAppointmentProjecttype() {
        return appointmentProjecttype;
    }

    public void setAppointmentProjecttype(String appointmentProjecttype) {
        this.appointmentProjecttype = appointmentProjecttype == null ? null : appointmentProjecttype.trim();
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime == null ? null : appointmentTime.trim();
    }
}