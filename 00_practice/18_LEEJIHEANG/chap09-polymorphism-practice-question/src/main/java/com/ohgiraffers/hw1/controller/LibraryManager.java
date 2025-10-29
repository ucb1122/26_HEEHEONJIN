package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;

    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }
    public void insertMember(Member mem){

    }
    /*전달받은 mem 주소값을 통해
LibraryManager의 mem에 대입*/
    // 3...LibraryManager의 insertMember 메소드로 전달받음

    public Member myinfo(){
        return null;
    }
    /*회원 레퍼런스(mem) 주소값 리턴*/
    public Book[] selectAll(){
        return new Book[0];
    }
    /*도서 전체 목록 (bList) 주소값 리턴*/
    public Book[] searchBook(String keyword){
        return new Book[0];
    }
    /*전달받은 키워드가 포함된 도서가 여
러 개가 존재할 수 있으니 검색된 도
서를 담아줄 Book 객체 배열을 새로
이 생성하고
for문을 통해 bList 안의 도서들과 전
달받은 키워드를 비교하여 포함하고
있는 경우 새로운 배열에 차곡차곡
담기
→ 그 배열 주소 값 리턴
*/
    public int rentBook(int index){
        return index;
    }
    /*result를 0으로 초기화 한 후 전달받
은 인덱스의 도서가 만화책인 경우
회원의 나이와 해당 만화책의 제한
나이를 비교하여 회원 나이가 더 적
은 경우 result를 1로 초기화
아니면 전달받은 인덱스의 도서가 요
리책인 경우 해당 요리책의 쿠폰 유
무가 유일 경우 회원의 couponCount
를 1증가 시킨 후 result 2로 초기화
→ result 리턴
*/

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }
}