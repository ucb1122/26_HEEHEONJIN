package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        // a.testSimpleIfStatement();
        // a.testNestedIfStatement();

        B_ifelse b = new B_ifelse();
        //b.testSimpleIfElseStatement();

        C_ifElseif c = new C_ifElseif();
        //c.testIfElseifStatement();
        c.testNestedIfElseifStatement();
    }
}
