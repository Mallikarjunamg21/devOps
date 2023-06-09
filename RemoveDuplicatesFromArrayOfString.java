package JavaInterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayOfString {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "banana", "grape"};

        String[] uniqueArray = removeDuplicates(array);

        for (String str : uniqueArray) {
            System.out.println(str);
        }
    }

    public static String[] removeDuplicates(String[] array) {
        HashSet<String> set = new HashSet<>();
        List<String> resultList = new ArrayList<>();

        for (String str : array) {
            if (!set.contains(str)) {
                set.add(str);
                resultList.add(str);
            }
        }

        return resultList.toArray(new String[0]);
    }
}
