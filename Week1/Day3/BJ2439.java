package Week1.Day3;
import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int t = getNum.nextInt();

        for(int i = 0; i < t; i++){
            for(int j = 1; j < t-i; j++){
                System.out.printf(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        getNum.close();
    }
}