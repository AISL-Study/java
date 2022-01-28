package Week3;

class Car {
    String color;
    int speed;

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
}


public class oop_exam1 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차 1의 색상은"+myCar1.color+"이며, 현재 속도는"  + myCar1.speed+"km입니다.");
        System.out.println("자동차 1의 색상은"+myCar1.getColor()+"이며, 현재 속도는"  + myCar1.getSpeed()+"km입니다.");

    }
}
