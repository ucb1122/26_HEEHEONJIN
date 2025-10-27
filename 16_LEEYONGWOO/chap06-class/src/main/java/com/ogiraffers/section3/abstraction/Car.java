package com.ogiraffers.section3.abstraction;

public class Car {
    private boolean isOn=false;//시작은 시동이 꺼져 있는 상태
    private int speed; //속도


    //시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
    public void startUp(){
        if(this.isOn==true){
            System.out.println("이미 시동이 걸려 있습니다.");
        }else{
            this.isOn=true;
            System.out.println("시동을 걸었습니다. 부릉부릉~~");
        }
    }
    public void go(){
        if(this.isOn==false){
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }else{
            this.speed+=10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는 "+this.speed+" km/h");
        }
    }
    public void stop(){
        if(this.isOn==false){
            System.out.println("시동이 걸려있지 않습니다.");
        }else{
            if(this.speed>0){
                speed=0;
                System.out.println("급브이크를 밟았습니다. 차를 멈춥니다.");
            }else{
                System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
            }
        }
    }
    public void turnOff(){
        if(isOn){
            if (speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다 차를 우선 멈춰주세요");
            }else{
                isOn=false;
                System.out.println("시동을 끕니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }
}
