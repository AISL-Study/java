package Week1.Day2;
import java.util.Scanner;

public class BJ14681 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int x, y;
        x = getNum.nextInt();
        y = getNum.nextInt();

        if(x>0 && y>0){
            System.out.println(1);
        }
        else if(x<0 && y>0){
            System.out.println(2);
        }
        else if(x<0 && y<0){
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
        
        getNum.close();
    }    
}