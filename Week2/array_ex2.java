package Week2;
import java.util.stream.Stream;
import java.util.*;

public class array_ex2 {
    public static void main(String[] args) {

        Integer[] arr1 = {1,3,2};
        Integer[] arr2 = {2,3,1};

        Integer[] new_Arr = Stream.of(arr1, arr2).flatMap(Stream::of).toArray(Integer[]::new); //배열 합치기

        System.out.println(Arrays.toString(new_Arr));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(new_Arr)); //배열을 Linked HashSet으로 변환

        Integer[] result_Arr = linkedHashSet.toArray(new Integer[0]); //Linked HashSet을 배열로 변환

        System.out.println(Arrays.toString(result_Arr));

    }
    
}
