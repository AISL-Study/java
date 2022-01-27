
package Week1.Day4;
import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        String s = getNum.next();

        int[] arr = new int[26] ;

        for (int i = 0; i < 26; i++){
            arr[i] = -1;
        }

        for (int j = 0; j<s.length(); j++){
            int c = s.charAt(j);

            if(arr[c-97]==-1){
                arr[c-97] = j;
            }
        }
        
        for (int k = 0; k < 26; k++){
            System.out.print(arr[k]+" ");
        }

        getNum.close();
    }
}