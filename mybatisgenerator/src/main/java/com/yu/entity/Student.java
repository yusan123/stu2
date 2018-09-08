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

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public Byte getStudentSex() {
        return studentSex;
    }

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public Byte getStudentStatus() {
        return studentStatus;
    }
}