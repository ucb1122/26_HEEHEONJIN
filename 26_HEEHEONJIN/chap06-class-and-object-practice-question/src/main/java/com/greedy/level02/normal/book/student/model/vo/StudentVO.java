package main.java.com.greedy.level02.normal.book.student.model.vo;

public class StudentVO {
    int grade;
    int classroom;
    String name;
    double height;
    char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int classroom, String name, double height, char gender) {

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void printInformation() {
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + classroom);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("성별 : " + gender);

    }
}
