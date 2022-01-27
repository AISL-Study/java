package Week1.Day3;
import java.util.Scanner;

public class BJ10950 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int t = getNum.nextInt();

        for(int i = 0; i < t; i++){
            int a = getNum.nextInt();
            int b = getNum.nextInt();

            System.out.println(a+b);
        }
        getNum.close();
    }
}
