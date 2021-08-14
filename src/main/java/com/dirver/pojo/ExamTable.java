package com.dirver.pojo;

import java.math.BigDecimal;

public class ExamTable {
    private Integer examId;

    private String examUsername;

    private String examUserphone;

    private String examProjecttype;

    private String examCartype;

    private Integer examAchievement;

    private Integer examFied;

    private String examTime;

    private BigDecimal examCost;

    private String examCoststate;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamUsername() {
        return examUsername;
    }

    public void setExamUsername(String examUsername) {
        this.examUsername = examUsername == null ? null : examUsername.trim();
    }

    public String getExamUserphone() {
        return examUserphone;
    }

    public void setExamUserphone(String examUserphone) {
        this.examUserphone = examUserphone == null ? null : examUserphone.trim();
    }

    public String getExamProjecttype() {
        return examProjecttype;
    }

    public void setExamProjecttype(String examProjecttype) {
        this.examProjecttype = examProjecttype == null ? null : examProjecttype.trim();
    }

    public String getExamCartype() {
        return examCartype;
    }

    public void setExamCartype(String examCartype) {
        this.examCartype = examCartype == null ? null : examCartype.trim();
    }

    public Integer getExamAchievement() {
        return examAchievement;
    }

    public void setExamAchievement(Integer examAchievement) {
        this.examAchievement = examAchievement;
    }

    public Integer getExamFied() {
        return examFied;
    }

    public void setExamFied(Integer examFied) {
        this.examFied = examFied;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime == null ? null : examTime.trim();
    }

    public BigDecimal getExamCost() {
        return examCost;
    }

    public void setExamCost(BigDecimal examCost) {
        this.examCost = examCost;
    }

    public String getExamCoststate() {
        return examCoststate;
    }

    public void setExamCoststate(String examCoststate) {
        this.examCoststate = examCoststate == null ? null : examCoststate.trim();
    }
}