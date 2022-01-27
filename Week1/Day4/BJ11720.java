package Week1.Day4;
import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int n = getNum.nextInt();
        String num = getNum.next();
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += num.charAt(i)-48;
        }

        System.out.println(sum);
        getNum.close();
    }
}