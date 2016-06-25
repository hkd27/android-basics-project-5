package com.hemantdave.reportcard;

import java.util.HashMap;


public class reportCardPojo {


    private String math="";
    private String Science="";
    private String SocialStudies="";
    private String EnglishLiterature;
    private String studentName="";
    private String rollNo="";
    public HashMap<String,String> reportCard=new HashMap<>();
    private int year=0;


    /*This is the Constructor*/
    public reportCardPojo(String math, String science, String socialStudies, String englishLiterature, String studentName, String rollNo, int year) {
        this.math = math;
        Science = science;
        SocialStudies = socialStudies;
        EnglishLiterature = englishLiterature;
        this.studentName = studentName;
        this.rollNo = rollNo;

        this.year = year;
    }
    public String GetReportCard(){  /*Here i have implemented the toString method*/
        reportCard.put("Student Name",studentName);
        reportCard.put("Roll Number",rollNo);
        reportCard.put("Year",year+"");
        reportCard.put("Math",math);
        reportCard.put("Science",Science);
        reportCard.put("Social Studies",SocialStudies);
        reportCard.put("English Litreature",EnglishLiterature);

        return reportCard.toString();


    }
    public String getMath() {

        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getScience() {
        return Science;
    }

    public void setScience(String science) {
        Science = science;
    }

    public String getSocialStudies() {
        return SocialStudies;
    }

    public void setSocialStudies(String socialStudies) {
        SocialStudies = socialStudies;
    }

    public String getEnglishLiterature() {
        return EnglishLiterature;
    }

    public void setEnglishLiterature(String englishLiterature) {
        EnglishLiterature = englishLiterature;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
