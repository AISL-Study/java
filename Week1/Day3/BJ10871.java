package Week1.Day3;
import java.util.Scanner;

public class BJ10871{
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int n = getNum.nextInt();
        int x = getNum.nextInt();

        for(int i = 0; i < n; i++){
            int a = getNum.nextInt();
            if(x>a){
                System.out.printf(a+" ");
            }  
        }
        getNum.close();
    }
}