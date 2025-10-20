package com.sehyeon.section03.constant;

public class Application1
{
    public static void main(String[] args) {
        /* 1. 상수 선언
         * 상수 선언 시 자료형 앞에 final 키워드를 붙인다. */
        final int AGE;

        /* 2. 초기화 */
        AGE = 20;
        //AGE = 30;		//한 번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.

        /* 3. 필요한 위치에 상수를 호출해서 사용한다. */
        /* 3-1. 출력 구문에서 사용 */
        System.out.println("AGE의 값 : " + AGE);
        /* 3-2. 필요시 연산식에 호출해서 사용 */
        System.out.println("AGE의 2배 : " + (AGE * 2));

        // 상수 명명 규칙
        // 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;		//소문자로 사용은 가능하지만 변수와 구분하기 힘들기 때문에 만들어진 규칙이다.

        // 단어와 단어 연결은 언더스코어를 사용한다.
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30;		//camel case 사용이 가능하지만 역시 변수와 구분되지 않는다.



    }
}
