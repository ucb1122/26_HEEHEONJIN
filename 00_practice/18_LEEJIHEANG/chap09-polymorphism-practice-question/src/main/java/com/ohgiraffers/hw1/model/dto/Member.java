package com.ohgiraffers.hw1.model.dto;

public class Member {
    private String name; // 회원명
    private int age;     // 회원나이
    private char gender; // 성별
    private int couponCount = 0; // 요리학원쿠폰개수 = 0

    public Member() {
    }

    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
}
