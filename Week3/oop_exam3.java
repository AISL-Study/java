package Week3;

class Car {
    private String color;
    private int speed;

    Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
}


public class oop_exam3 {
    public static void main(String[] args) {
        Car myCar1 = new Car("빨강",0);
        Car myCar2 = new Car("파랑",30);

        System.out.println("자동차 1의 색상은"+myCar1.getColor()+"이며, 현재 속도는"  + myCar1.getSpeed()+"km입니다.");
        System.out.println("자동차 2의 색상은"+myCar2.getColor()+"이며, 현재 속도는"  + myCar2.getSpeed()+"km입니다.");
   
    }
}