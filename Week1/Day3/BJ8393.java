package Week1.Day3;
import java.util.Scanner;

public class BJ8393 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int n = getNum.nextInt();
        int sum =0 ;
        
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
        getNum.close();
    }
}
