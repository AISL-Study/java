package Week3;

abstract class Car{
    int speed = 0;
    String color;

    void upSpeed(int speed){
        this.speed += speed;
    }
}

class Sedan extends Car{
    void work(){
        System.out.println("승용차가 사람을 태우고 있다");
    }
}
class Truck extends Car{
    void work(){
        System.out.println("트럭이 짐을 싣고 있다");
    }
}

public class oop_exam6 {
    public static void main(String[] args) {
    
        Sedan sedan1 = new Sedan();
        System.out.println("승용차 인스턴스 생성");
        sedan1.work();
        Truck truck1 = new Truck();
        System.out.println("트럭 인스턴스 생성");
        truck1.work();
    }

    
}
