package Week3;

class Car{
    Car(){
        System.out.println("슈퍼 클래스 생성자 호출(파라미터 없음)");
    }
    Car(String str){
        System.out.println("슈퍼 클래스 생성자 호출 -->" + str);
    }
}

class Sedan extends Car{
    Sedan(String str){
        System.out.println("서브 클래스 생성자 호출 -->" + str);
    }
}

public class oop_exam4 {
    public static void main(String[] args) {
    
        Sedan sedan1 = new Sedan ("여기요~~");
    }  
}
