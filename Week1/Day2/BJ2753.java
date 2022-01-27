package Week1.Day2;
import java.util.Scanner;

public class BJ2753 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int year;
        year = getNum.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        getNum.close();
    }    
}