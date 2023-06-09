package JavaInterviewPrograms;

public class ReverseStringUsingCharArray {
    public static void main(String[] args) {
        String str = "MGM";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers inward
            left++;
            right--;
        }
        return new String(charArray);
    }
}
