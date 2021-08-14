package com.dirver.pojo;

import java.math.BigDecimal;

public class ExamtypeTable {
    private Integer examId;

    private String examType;

    private BigDecimal examCost;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType == null ? null : examType.trim();
    }

    public BigDecimal getExamCost() {
        return examCost;
    }

    public void setExamCost(BigDecimal examCost) {
        this.examCost = examCost;
    }
}