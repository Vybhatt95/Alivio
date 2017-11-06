package com.ex.alivio.objects;

import javax.persistence.*;

@Entity
@Table(name="SCHOOL")
public class School {
    private int schoolId;
    private String schoolName;
    private String schoolAddress;

    @Id
    @Column(name="SCHOOLID")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
    @Column(name="SCHOOLNAME")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Column(name="SCHOOLADDRESS")
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
