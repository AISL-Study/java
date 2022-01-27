package Week1.Day1;
import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int a, b;
        a = getNum.nextInt();
        b = getNum.nextInt();

        System.out.printf("%d\n",a*(b%10));
        System.out.printf("%d\n",a*(b/10%10));
        System.out.printf("%d\n",a*(b/100));
        System.out.println(a*b);

        getNum.close();
    }        
}