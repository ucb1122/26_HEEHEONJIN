package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        //a.testSimpleIfStatement();
        //a.testNestedIfStatement();
        B_ifElse b = new B_ifElse();
        //b.testSimpleIfElseStatement();
        C_ifElseif c = new C_ifElseif();
        //c.testifElseifStatement();
        //c.testNestedifElseifStatement();
        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        d.improveSwitchStatement();
    }
}
