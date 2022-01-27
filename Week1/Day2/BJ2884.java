
package Week1.Day2;
import java.util.Scanner;

public class BJ2884 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int h, m;
        h = getNum.nextInt();
        m = getNum.nextInt();


        if(m>=45){
            System.out.printf("%d %d", h, m-45);
        }
        else if(h>=1 && m<45){
            System.out.printf("%d %d", h-1, (60+m)-45);
        }
        else{
            System.out.printf("%d %d", (24+h)-1, (60+m)-45);
        }
        
        getNum.close();
    }    
}