package sec03.increment;

public class Application1 {
    public static void main(String[] args) {

        /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);

        num++;		//1 증가
        System.out.println("num : " + num);

        ++num;		//1 증가
        System.out.println("num : " + num);

        num--;		//1 감소
        System.out.println("num : " + num);

        --num;		//1 감소
        System.out.println("num : " + num);

        int firstNum = 20;

        int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3; //증가를 먼저 처리하고 난 뒤 다른 연산을 함
        // ++는 느긋하므로 연산 후 나중에 변환
        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;  // int d = 3 + 4(4) = 7 // b = 4
        b = 2 * (-c + a++) - d; // b = 2 * (1 + 3) - 7 = 1 // b = 1,a = 4
        c *= 2; // c = -1 * 2 = -2
        a = b++ + c; // a = 1 + -2 = -1 , b = 1 + 1 = 2, c = -2 d =7

        System.out.println("a = " + -1);
        System.out.println("b = " + 2);
        System.out.println("c = " + -2);
        System.out.println("d = " + 7);
    }
}