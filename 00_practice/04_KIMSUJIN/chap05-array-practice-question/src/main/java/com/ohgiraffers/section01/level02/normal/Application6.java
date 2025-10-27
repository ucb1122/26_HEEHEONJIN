package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */
        Scanner sc = new Scanner(System.in);

        //문자열 입력받기(치킨메뉴)
        System.out.print("치킨 이름을 입력하세요 : ");
        String input = sc.nextLine();

        //치킨 배열 선언 및 초기화
        String chick [] = {"후라이드", "뿌링클", "양념", "간장"};

        //for문으로 입력받은 문자 있는지 확인
        for (int i = 0;  i <= chick.length; i++){
            if (i == chick.length){
                System.out.println(input + "은 없는 메뉴입니다.");
            }
            else if (!chick[i].equals(input)){
                continue;
            }else if (chick[i].equals(input)){
                System.out.println(input + "배달 가능");
                break;
            }
        }
    }
}
