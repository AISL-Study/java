package Week2;

public class array_ex1 {
    public static void main(String[] args) {

        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};

        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.println("arr1의 "+(i+1)+"번째 숫자와 arr2의 " +(j+1)+"번째 숫자의 값이 동일합니다.");
                }
            }
        }

    }
}
