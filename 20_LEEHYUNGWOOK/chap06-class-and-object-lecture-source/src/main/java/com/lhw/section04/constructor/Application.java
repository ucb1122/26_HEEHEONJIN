package com.lhw.section04.constructor;

import java.util.Date;
import java.util.Scanner;

public class Application {


    public  static void main(String[] args) {

        /* 생성자 함수가 무엇인지 이해하고 선언 및 호출하자 */
        /*
        생성자 사용 목적
        1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
        2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드 초기화할 경우
        3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않고 싶을 경우
        => 인스턴스 생성 방법 제한, 초기값 전달 강제화
        */
        // 기본 생성자는 빈 값이다. 따라서 값을 넣고 싶으면 매개변수를 사용해야 한다.
        User user1 = new User();
        System.out.println("user1 : " + user1.getInformation());

        User user2 = new User("user01", "pass02");
        System.out.println("user2.getInformation() = " + user2.getInformation());

        User user3 = new User("user03", "pass03", "홍길동", new Date());
        System.out.println(user3.getInformation());
    }
}
