package com.lhw.section02.dimensional;

public class Application1 {

    public static void main(String[] args) {

        /* 1. 배열의 주소를 보관할 레퍼런스 변수를 선언(stack)*/
        int iarr2[][];
        int[] iarr3[];

        int [][] iarr1;
        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열 생성(heap)*/
//        iarr1 = new int[][];  ->  크기를 지정하지 않으면 생성 X
//        iarr1 = new int[][3]; -> 첫번째 칸(주소관리배열)을 비워놔도 생성X
        iarr1 = new int[3][];

        /* 3. 주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당(heap)*/
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        /* 2중 배열의 주소관리배열에 주소값이 할당된다.*/
        System.out.println(iarr1[0]);

        /* 2중 배열 선언 할당*/
        iarr2 = new int[3][5];

        /* 4. 각 배열의 인덱스에 차례로 접근해서 값 출력*/
        for (int i = 0; i< iarr2.length;i++) {
            for (int j = 0; j<iarr2[i].length;j++){
                System.out.print(iarr2[i][j]);
            }
            System.out.println();
        }
    }
}
