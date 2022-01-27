package Week1.Day2;
import java.util.Scanner;

public class BJ9498_1 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int score;
        score = getNum.nextInt();

        if(score<60){
            System.out.println("F");
        }
        else if(score<70){
            System.out.println("D");
        }
        else if(score<80){
            System.out.println("C");
        }
        else if(score<90){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }

        getNum.close();
    }    
}
