package com.example.student.Bean;

public class Student {
    private String StudentID;
    private String Gender;
    private String Education;
    private String Major;
    private String PoliticalStatus;
    private String ResearchDirection;
    private String EmploymentIntentionRegion;
    private String EmploymentIntentionUnit;

    public Student(String studentID, String gender, String education, String major, String politicalStatus, String researchDirection, String employmentIntentionRegion, String employmentIntentionUnit) {
        StudentID = studentID;
        Gender = gender;
        Education = education;
        Major = major;
        PoliticalStatus = politicalStatus;
        ResearchDirection = researchDirection;
        EmploymentIntentionRegion = employmentIntentionRegion;
        EmploymentIntentionUnit = employmentIntentionUnit;
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

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Education='" + Education + '\'' +
                ", Major='" + Major + '\'' +
                ", PoliticalStatus='" + PoliticalStatus + '\'' +
                ", ResearchDirection='" + ResearchDirection + '\'' +
                ", EmploymentIntentionRegion='" + EmploymentIntentionRegion + '\'' +
                ", EmploymentIntentionUnit='" + EmploymentIntentionUnit + '\'' +
                '}';
    }
}
