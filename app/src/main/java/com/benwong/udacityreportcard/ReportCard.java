package com.benwong.udacityreportcard;

/**
 * Created by benwong on 2016-07-06.
 */
public class ReportCard {

    private static String school = "Example High School";
    private String course;
    private int grade;
    private String semester;

    public ReportCard(String course, int grade, String semester) {
        this.course = course;
        this.grade = grade;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "course='" + course + '\'' +
                ", grade=" + grade +
                ", semester='" + semester + '\'' +
                '}';
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String assignGrade(int mark){

        String grade;

        if(mark > 79 && mark < 101){
            grade = "A";
        } else if (mark > 69 && mark < 50){
            grade = "B";
        } else if (mark > 59 && mark < 70){
            grade = "C";
        }  else if (mark > 49 && mark < 60){
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

    public String getRemark(String grade){

        String remark;

        switch(grade){
            case "A":
                remark = "Excellent work!";
                break;
            case "B":
                remark = "Good work!";
                break;
            case "C":
                remark = "Nice try!";
                break;
            case "D":
                remark = "Try harder if you don't want to fail.";
                break;
            case "F":
                remark = "Fail!";
                break;
            default:
                remark = "Unknown";
                break;

        }

        return remark;
    }
    
}
