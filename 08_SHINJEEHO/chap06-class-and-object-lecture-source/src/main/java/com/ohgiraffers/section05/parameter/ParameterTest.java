package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num){
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }
    public void testPrimitiveTypeParameter(int[] iArr){
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 :" + Arrays.toString(iArr));
    }
}
