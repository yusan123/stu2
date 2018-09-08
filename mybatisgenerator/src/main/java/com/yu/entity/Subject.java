package com.yu.entity;

public class Subject {
    private Integer subId;

    private String subName;

    private Integer deptNo;

    public Subject(Integer subId, String subName, Integer deptNo) {
        this.subId = subId;
        this.subName = subName;
        this.deptNo = deptNo;
    }

    public Integer getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public Integer getDeptNo() {
        return deptNo;
    }
}