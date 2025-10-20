package com.sehyeon.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        // 변수의 사용 목적
        // 값에 의미를 부여하기 위한 목적 (가독성)
        /* 아래 처럼 작성하면 어느 값이 급여인지 어느 값이 보너스 금액인지 알 수 없다. */


        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");
        /* 아래 처럼 의미를 부여하게 되면 어느 값이 급여인지, 보너스인지를 명확하게 알 수 있게 한다. */
        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        // 한번 저장해둔 값을 재사용하기 위한 목적
        /* 10명의 고객에게 100 포인트를 지급해주는 내용을 출력하도록 작성해보자 */
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println();

        /* 위 코드에서 공통적으로 사용된 100이라고 하는 값을 변수에 넣고 변수를 호출하여 코드를 개선해보자 */
        int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");

        // 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
        int sum = 0;

        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);

        sum = sum + 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면? " + sum);

        sum = sum + 10;
        System.out.println("sum에 20이 있었는데 추가로 10을 더 더하면? " + sum);

        // 변수 명명 규칙

        /*1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        2. 변수의 이름에는 자바에서 사용중인 키워드(keyword)를 사용할 수 없다.
        ex) int, float, while, continue, 등등
        3. 변수의 이름은 영문자 대소문자를 구분한다.
                **ex**)** age와 Age는 다르다.
        4. 변수의 이름은 숫자로 시작할 수 없다.
        ex**)** 123abc - **사용불가**
                5. 특수기호는 '_'와 '$'만 사용 가능하다.
                ex**)** *abc*_zxc, abc$123, _abc123, 등등
        /* 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
//int age = 20; 		   //동일한 변수명을 가지므로 에러 발생함

        /* 1-2. 예약어는 사용이 불가능하다. */
//int true = 1;			//예약어 사용 불가
//int for = 20;			//예약어 사용 불가

        /* 1-3. 변수명은 대소문자를 구분한다. */
        int Age = 20;			//위에서 만든 age와 다른 것으로 취급한다.
        int True = 10;     //예약어 True와 다른 것으로 취급한다.

        /* 1-4. 변수명은 숫자로 시작할 수 없다. */
//int 1age = 20;		//숫자로 시작해서 에러 발생
        int age1 = 20;			//숫자가 처음에 시작하지 않으면 섞어서 사용도 가능함

        /* 1-5. 특수기호는 '-'와 '$'만 사용 가능하다. */
//int sh@rp = 20;		//사용 가능한 특수문자 외에는 사용 불가능
        int _age = 20;				//언더스코어는 사용 가능함. 처음도 가능하고 중간이나 끝에도 가능함
        int $harp = 20;			//$도 사용 가능함. 처음도 가능하고 중간이나 끝에도 가능함


    }
}
