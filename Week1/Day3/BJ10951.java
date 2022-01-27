
package Week1.Day3;
import java.util.Scanner;

public class BJ10951 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        while(getNum.hasNextInt()){ //Scanner 객체 입력값이 int값일 때만 true 반환
            int a = getNum.nextInt();
            int b = getNum.nextInt();
            System.out.println(a+b);
        }

        getNum.close();
    }
}