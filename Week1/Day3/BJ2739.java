package Week1.Day3;
import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int n = getNum.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d%n",n, i, n*i);    
        }
        getNum.close();
    }
}
