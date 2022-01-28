package Week3;
interface Car{
    static final int count = 0;
    abstract void work();
}

class Sedan implements Car{
    public void work(){
        System.out.println("승용차가 사람을 태우고 있다");
    }
}
class Truck implements Car{
    public void work(){
        System.out.println("트럭이 짐을 싣고 있다");
    }
}

public class oop_exam7 {
    public static void main(String[] args) {
    
        Sedan sedan1 = new Sedan();
        sedan1.work();
        Truck truck1 = new Truck();
        truck1.work();
    }

    
}
