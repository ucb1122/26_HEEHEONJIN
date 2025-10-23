package com.sekong.section01.dimensioanl;

public class Application1 {
    public static void main(String[] args) {
        // 1. 배열의 주소를 보관할 레퍼런스 변수 선언 (stack)
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        // 2. 여러개의 1차원 배열의 주소를 관리하는 배열 생성(heap)
//        iarr1 = new int[][]; -> 크기를 지정하지 않으면 생성 불가
//        iarr1 = new int[][4]; -> 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 생성 불가
        iarr1 = new int[3][];
        System.out.println(iarr1[0]);
        // 3. 주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당(heap)
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        System.out.println(iarr1[0]); // 주소값
        System.out.println(iarr1[0][0]); // 원소값 (초기값 0)

        // 한 번에 이차월 배열을 선언하고 할당할 수 있다.
        iarr2 = new int[3][5]; // 정변 배열

        // 4. 각 배열의 인덱스에 차례로 접근해서 값 출력
        for (int i = 0; i< iarr2.length; i++){
            for (int j = 0; j< iarr2[i].length; j++){
                iarr2[i][j] = j;
                System.out.println("iarr2["+i+"]["+j+"] = " + iarr2[i][j]);
            }
        }

    }
}
