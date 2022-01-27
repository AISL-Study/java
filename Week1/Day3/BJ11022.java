package Week1.Day3;
import java.util.Scanner;

public class BJ11022 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int t = getNum.nextInt();

        for(int i = 1; i <= t; i++){
            int a = getNum.nextInt();
            int b = getNum.nextInt();

            System.out.printf("Case #%d: %d + %d = %d%n",i,a,b,a+b);
        }
        getNum.close();
    }
}