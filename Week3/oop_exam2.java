package Week3;

class Car {
    private String color;
    private int speed;

    void upSpeed(int value){
        speed = speed + value;
    } 
    void downSpeed(int value){
        speed = speed - value;
    }
    String getColor(){
        return color;
    }
    int getSpeed(){
        return speed;
    }
    void setColor(String color){
        this.color = color;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
}


public class oop_exam2 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.setColor("빨강");
        myCar1.setSpeed (0);

        myCar1.upSpeed(30);
        System.out.println("자동차 1의 색상은"+myCar1.getColor()+"이며, 현재 속도는"  + myCar1.getSpeed()+"km입니다.");

    }
}