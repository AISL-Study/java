
package Week1.Day4;
import java.util.*;

public class BJ1152 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        String s = getNum.nextLine();
        StringTokenizer st = new StringTokenizer(s);

        System.out.println(st.countTokens());
        getNum.close();
    }
}