package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

        public void testSimpleSwitchStatement() {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 정수 : ");
            int first = sc.nextInt();
            System.out.println("두 번째 정수 : ");
            int second = sc.nextInt();
            System.out.println("연산 기호 입력");
            char op = sc.next().charAt(0);

            int result = 0;

            switch (op) {
                case '+': result = first + second; break;
                case '-': result = first - second; break;
                case '*':
                case 'x': result = first * second; break;
                case '/': result = first / second; break;
                case '%': result = first % second; break;
                /*case에서 일치 값을 찾지 못할 경우 수행할 구문을 작성할 수 있다.*/
                default:
        }

            System.out.println(first + "" + op + "" +second + " = " + result);
    }

    public void improveSwitchStatement() {
            /*java 14부터 적용된 switch문 사용에 대한 흐름*/
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력");
        char op = sc.next().charAt(0);

        int result = switch (op) {
          case '+'-> {
              System.out.println("더하기 연사자 실행");
              yield first + second;
          }
          case '-'-> first -second;
          case '*'-> first *second;
          case '/'-> first / second;
          case '%'-> first % second;
          default -> 0;





        };

        System.out.println(first + "" + op + "" +second + " = " + result);
    }
}
