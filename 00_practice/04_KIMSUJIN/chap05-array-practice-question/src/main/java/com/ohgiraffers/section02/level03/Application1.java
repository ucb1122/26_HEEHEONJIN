package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        Application1 app = new Application1();
//        app.arrayTest1(arr);
//        app.arrayTest2(arr);
//        app.arrayTest3(arr);
//        app.arrayTest4(arr);
//        app.arrayTest5(arr);
//        app.arrayTest6(arr);
        app.arrayTest7(arr);
    }

    /**
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 16
     *
     * @param arr
     */

    public void arrayTest1(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = value;
                System.out.print(arr[i][j] + " ");
                value++;
            }
            System.out.println();
        }

    }

    /**
     * 1 5 9 13
     * 2 6 10 14
     * 3 7 11 15
     * 4 8 12 16
     *
     * @param arr
     */
    public void arrayTest2(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[j][i] = value;
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 4 3 2 1
     * 8 7 6 5
     * 12 11 10 9
     * 16 15 14 13
     *
     * @param arr
     */
    public void arrayTest3(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[i][3 - j] = value;
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 16 12 8 4
     * 15 11 7 3
     * 14 10 6 2
     * 13 9 5 1
     *
     * @param arr
     */
    public void arrayTest4(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[3 - j][3 - i] = value;;
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 13 14 15 16
     * 9 10 11 12
     * 5 6 7 8
     * 1 2 3 4
     *
     * @param arr
     */
    public void arrayTest5(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[3 - i][j] = value;;
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 13 9 5 1
     * 14 10 6 2
     * 15 11 7 3
     * 16 12 8 4
     *
     * @param arr
     */
    public void arrayTest6(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[j][3-i] = value;;
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 4 8 0 16
     * 0 7 11 0
     * 2 0 10 14
     * 1 5 0 13
     *
     *  3의 배수인 경우 continue;
     * @param arr
     */
    public void arrayTest7(int[][] arr) {
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                if (value %  3 == 0){
                    arr[3 - j][i] = 0;
                }else {
                    arr[3 - j][i] = value;
                }
                value++;
            }
        }

        //출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {

    }
}
