package com.ohgiraffers.section01.array;

public class Application02 {

    public static void main(String[] args) {

        /* 배열의 선언 : stack 공간에 배열의 주소를 보관할
        * **레퍼런스 변수** 공간을 만드는 것*/
        int [] iarr;        // int i;
        double [] darr;     // double d;

        /*
        * 선언한 레퍼런스 변수에 배열을 할당하여 대입 가능
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소 값을 반환
        * 발생한 주소가 레퍼런스 변수(참조형 변수)에 저장되고 이것을 참조하여 사용하기 때문에
        * 참조 자료형이라고 명함*/

        iarr = new int[5];
        darr = new double[10];

        System.out.println("iarr :" + iarr);
        System.out.println("darr :" + darr);

        /*
        * hashCode() : 객체의 주소 값을 10진수로 변환하여
        * 생성한 객체의 고유 정수값을 반환하는 메소드
        * */
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        /*
        * 배열의 길이를 알 수 있는 필드 제공
        * String 클래스는 메소드로 제공하여 length()로 사용하는 점에 유의
        * */

        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        /* 한 번 지정한 배열의 길이는 변경 불가
        * 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 담음
        * */

        iarr = new int[100];
        System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
        System.out.println("수정된 iarr.length : " + iarr.length);

        /*
        * 레퍼런스 변수가 아무런 주소를 참조하지 않는 상태 -> null
        * 100개 짜리의 배열이 더 이상 참조되지 않으므로 GC(가비지 컬렉터)에 의해 제거
        * */
        iarr = null;

        /*
        * null이라는 특수한 값을 참조하고 있을 경우 참조 연산자(.) 사용시
        * java.lang.NullPointerException이 발생
        * */
        System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
        System.out.println("수정된 iarr.length : " + iarr.length);

    }
}
