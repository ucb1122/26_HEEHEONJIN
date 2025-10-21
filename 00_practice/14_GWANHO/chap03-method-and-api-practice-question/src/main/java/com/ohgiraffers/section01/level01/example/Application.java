package com.ohgiraffers.section01.level01.example;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ExampleTest example = new ExampleTest();

        // 1
        Random rand = new Random();
        example.evenOdd(rand.nextInt());

        // 2
        example.findMax(rand.nextInt(100) , rand.nextInt(100));

        // 3
        example.randomMathQuiz();
    }
}
