package Week1.Day4;
import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        String s = getNum.next().toUpperCase();
        int[] arr = new int[26] ;
        int max = 0;
        char res = ' ';

        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i)-65;
            arr[c]++;
            
            if(max < arr[c]){
                max = arr[c];
                res =s.charAt(i);
            }
            else if(max == arr[c]){
                res = '?';
            }

        }
        System.out.print(res);
        getNum.close();
    }
}
