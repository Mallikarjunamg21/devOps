package JavaInterviewPrograms;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverseWithCollection {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        
        reverseArray(array);
        printArray(array);
    }
    
    public static void reverseArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        list.toArray(array);
    }
    
    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
