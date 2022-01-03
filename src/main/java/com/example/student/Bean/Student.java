package com.example.student.Bean;

public class Student {
    private String ID;
    private String StudentID;
    private String Gender;
    private String Education;
    private String Major;
    private String PoliticalStatus;
    private String ResearchDirection;
    private String EmploymentIntentionRegion;
    private String EmploymentIntentionUnit;
    private String InternshipPlan;
    private String EmploymentType;
    private String EmploymentUnit;
    private String location;

    public Student(String ID, String studentID, String gender, String education, String major, String politicalStatus, String researchDirection, String employmentIntentionRegion, String employmentIntentionUnit, String internshipPlan, String employmentType, String employmentUnit, String location) {
        this.ID = ID;
        StudentID = studentID;
        Gender = gender;
        Education = education;
        Major = major;
        PoliticalStatus = politicalStatus;
        ResearchDirection = researchDirection;
        EmploymentIntentionRegion = employmentIntentionRegion;
        EmploymentIntentionUnit = employmentIntentionUnit;
        InternshipPlan = internshipPlan;
        EmploymentType = employmentType;
        EmploymentUnit = employmentUnit;
        this.location = location;
    }

    public Student(String studentID, String gender, String education, String major, String politicalStatus, String researchDirection, String employmentIntentionRegion, String employmentIntentionUnit, String internshipPlan, String employmentType, String employmentUnit, String location) {
        StudentID = studentID;
        Gender = gender;
        Education = education;
        Major = major;
        PoliticalStatus = politicalStatus;
        ResearchDirection = researchDirection;
        EmploymentIntentionRegion = employmentIntentionRegion;
        EmploymentIntentionUnit = employmentIntentionUnit;
        InternshipPlan = internshipPlan;
        EmploymentType = employmentType;
        EmploymentUnit = employmentUnit;
        this.location = location;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getPoliticalStatus() {
        return PoliticalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        PoliticalStatus = politicalStatus;
    }

    public String getResearchDirection() {
        return ResearchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        ResearchDirection = researchDirection;
    }

    public String getEmploymentIntentionRegion() {
        return EmploymentIntentionRegion;
    }

    public void setEmploymentIntentionRegion(String employmentIntentionRegion) {
        EmploymentIntentionRegion = employmentIntentionRegion;
    }

    public String getEmploymentIntentionUnit() {
        return EmploymentIntentionUnit;
    }

    public void setEmploymentIntentionUnit(String employmentIntentionUnit) {
        EmploymentIntentionUnit = employmentIntentionUnit;
    }

    public String getInternshipPlan() {
        return InternshipPlan;
    }

    public void setInternshipPlan(String internshipPlan) {
        InternshipPlan = internshipPlan;
    }

    public String getEmploymentType() {
        return EmploymentType;
    }

    public void setEmploymentType(String employmentType) {
        EmploymentType = employmentType;
    }

    public String getEmploymentUnit() {
        return EmploymentUnit;
    }

    public void setEmploymentUnit(String employmentUnit) {
        EmploymentUnit = employmentUnit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", StudentID='" + StudentID + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Education='" + Education + '\'' +
                ", Major='" + Major + '\'' +
                ", PoliticalStatus='" + PoliticalStatus + '\'' +
                ", ResearchDirection='" + ResearchDirection + '\'' +
                ", EmploymentIntentionRegion='" + EmploymentIntentionRegion + '\'' +
                ", EmploymentIntentionUnit='" + EmploymentIntentionUnit + '\'' +
                ", InternshipPlan='" + InternshipPlan + '\'' +
                ", EmploymentType='" + EmploymentType + '\'' +
                ", EmploymentUnit='" + EmploymentUnit + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
