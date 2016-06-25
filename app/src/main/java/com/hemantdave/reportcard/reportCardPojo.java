package com.hemantdave.reportcard;

public class reportCardPojo {


    private String math="";
    private String Science="";
    private String SocialStudies="";
    private String EnglishLiterature;
    private String studentName="";
    private String rollNo="";
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
    @Override
    public String toString() {
        return " \n Name: '" + this.studentName + "', \n Roll Number: '" + this.rollNo + "', \n Year: '" + this.year + "'" +
                "  \n Marks: \n  Math:"+this.math+" \n Science"+this.Science+" \n Social Studies:"+this.SocialStudies+" \n" +
                " English Litreature:"+this.EnglishLiterature;
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
