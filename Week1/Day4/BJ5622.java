package Week1.Day4;
import java.util.Scanner;

public class BJ5622 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        String s = getNum.next();
        int[] time = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int sum =0;

        for(int i = 0; i<s.length(); i++){
            sum += time[s.charAt(i)-65];
        }

        System.out.print(sum);
        getNum.close();
    }
}
