package Week1.Day1;
import java.util.Scanner;

public class BJ10430 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int a, b, c;
        a = getNum.nextInt();
        b = getNum.nextInt();
        c = getNum.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);

        getNum.close();
    }        
}