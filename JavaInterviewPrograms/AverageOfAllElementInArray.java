package JavaInterviewPrograms;

public class AverageOfAllElementInArray{
    public static void main(String[] args) {
        int[] array = {104,96,73,81,73,81};
        double average = calculateAverage(array);
        System.out.println("Average: " + average);
    }
    
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return average;
    }
}