package Week1.Day3;
import java.util.Scanner;

public class BJ1110 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);
        
        int input, modify, cycle=0;

        input = getNum.nextInt();
        modify = input;
        
        while(true){
            modify=((modify % 10) * 10) + (((modify / 10) + (modify % 10)) % 10);
            cycle++;

            if(modify==input){
                break;
            }
        }
        System.out.println(cycle);
    
        getNum.close();
    }
}