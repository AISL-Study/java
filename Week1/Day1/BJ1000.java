package Week1.Day1;
import java.util.Scanner;

public class BJ1000 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int a, b;
        a = getNum.nextInt();
        b = getNum.nextInt();

        System.out.println(a+b);

        getNum.close();
    }    
}
