package com.ohgiraffers.section01.method;

public class Calculator {

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int subTowNumbers(int first, int second) {
        return first - second;
    }

    public static int minNumbersOf(int first, int second) {
        return (first < second) ? first : second;
    }

    public static int maxNumbersOf(int first, int second) {
        return (first > second) ? first : second;
    }
}
