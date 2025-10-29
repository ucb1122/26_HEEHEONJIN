package com.lhw.section03.overriding;

public class SubClass extends SuperClass{

    /*어느 상황에서 재정의 할 수 있겠는가
    * - 오버라이딩 성립 조건
    1. 메소드명 동일
    2. 메소드 리턴타입 동일
    3. 매개변수의 타입, 개수, 순서가 동일
    4. 부모 클래스의 private 메소드는 오버라이딩 불가능
    5. 부모 클래스의 final 키워드가 사용된 메소드는 오버라이딩 불가능
    6. 접근제어자는 부모 메소드와 같거나 더 넓은 범위여야 함
    7. 예외처리는 같은 예외이거나 더 구체적(하위)인 예외를 처리해야 함
    * */

    @Override // 가능!
    public void method(int num) {
        super.method(num);
    }

    @Override // 가능!
    protected void protectedMethod() {
        super.protectedMethod();
    }

    //@Override // 오류 : 더 좁은 범위 x
    //void protectedMethod() {}

    //@Override // 오류!
    //private void privateMethod() {}

}
