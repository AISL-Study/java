package Week1.Day4;
import java.util.Scanner;

public class BJ2941 {
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        String s = getNum.next();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        for(int i = 0; i < 8 ; i++){
            if(s.contains(croatia[i])){
                s = s.replace(croatia[i],"*");
            }
        }

        System.out.print(s.length());
        getNum.close();
    }
}
