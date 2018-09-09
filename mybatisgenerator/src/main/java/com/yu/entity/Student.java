package com.yu.entity;

public class Student {
    private Integer studentId;

    private String studentNo;

    private String studentName;

    private Integer studentAge;

    private Byte studentSex;

    private Integer subjectNo;

    private Integer deptNo;

    private Byte studentStatus;

    public Student(Integer studentId, String studentNo, String studentName, Integer studentAge, Byte studentSex, Integer subjectNo, Integer deptNo, Byte studentStatus) {
        this.studentId = studentId;
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
        this.subjectNo = subjectNo;
        this.deptNo = deptNo;
        this.studentStatus = studentStatus;
    }

    public Student() {
        super();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Byte getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Byte studentSex) {
        this.studentSex = studentSex;
    }

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public Byte getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Byte studentStatus) {
        this.studentStatus = studentStatus;
    }
}