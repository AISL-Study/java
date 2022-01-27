package Week1.Day3;
import java.util.Scanner;

public class BJ2742 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int n = getNum.nextInt();

        for(int i = n; i >=1 ; i--){
            System.out.println(i);    
        }
        getNum.close();
    }
}