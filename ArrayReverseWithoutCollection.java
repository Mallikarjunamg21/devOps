package JavaInterviewPrograms;

public class ArrayReverseWithoutCollection {
    public static void main(String[] args) {
        int[] array = {39,54,22,11,33,2};
        reverseArray(array);
        printArray(array);
    }
    
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move the pointers inward
            left++;
            right--;
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
       
    }
}
