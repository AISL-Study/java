package Week1.Day2;
import java.util.Scanner;

public class BJ1330 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int a, b;
        a = getNum.nextInt();
        b = getNum.nextInt();

        if(a>b){
            System.out.println(">");
        }

        else if(a<b){
            System.out.println("<");
        }

        else{
            System.out.println("==");
        }
        
        getNum.close();
    }    
} 
