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

    public Subject() {
        super();
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}