package Week1.Day4;
import java.util.Scanner;

public class BJ2908 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int a = getNum.nextInt();
        int b = getNum.nextInt();

        int flip_a= (a%10)*100 + ((a/10)%10)*10 +(a/100);
        int flip_b= (b%10)*100 + ((b/10)%10)*10 +(b/100);

        if(flip_a > flip_b){
            System.out.print(flip_a);
        }
        else{
            System.out.print(flip_b);
        }

        getNum.close();
    }
}
