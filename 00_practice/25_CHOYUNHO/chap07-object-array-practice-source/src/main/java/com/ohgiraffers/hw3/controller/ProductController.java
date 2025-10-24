package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro(){
        return ProductDTO;
    }

    public int count(){
    }
    Scanner sc = new Scanner(System.in);
    public void mainMenu(){
        Scanner sc = new Scanner(System.in);

        do{
            String menu = """
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    
                    """;


        }while(num == 9);
    }
    public void productInput(){

    }
    public void productPrint(){}

}

