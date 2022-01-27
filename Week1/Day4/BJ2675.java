
package Week1.Day4;
import java.util.Scanner;

public class BJ2675 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        int t = getNum.nextInt();

        for(int i = 0; i < t; i++){
            int r = getNum.nextInt();
            String s = getNum.next();

            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < r; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

        getNum.close();
    }
}