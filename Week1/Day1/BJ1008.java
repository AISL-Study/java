package Week1.Day1;
import java.util.Scanner;

public class BJ1008 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        double a, b;
        a = getNum.nextDouble();
        b = getNum.nextDouble();

        System.out.println(a/b);

        getNum.close();
    }        
}