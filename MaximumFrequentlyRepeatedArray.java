package JavaInterviewPrograms;

public class MaximumFrequentlyRepeatedArray{

	   //main method
	   public static void main(String[] args){
	   
	      //Declare and initialize the array elements
	       int[] arr = { 1, 2, 3, 1, 5, 7, 5, 5, 9 };
	       
	      //get the length of the array
	      int n = arr.length;
	      int max_count = 0;
	      int maxfreq = 0;
	       
	      //Logic implementation
	      for (int i = 0; i < n; i++){
	         int count = 0;
	         for (int j = 0; j < n; j++){
	            if (arr[i] == arr[j]){
	               count++;
	            }
	         }
	        
	         if (count > max_count){
	            max_count = count;
	            maxfreq = arr[i];
	         }
	      }
	      //print the result
	      System.out.println("Most frequent element is: " + maxfreq);
	      System.out.println(" Max Count : "+max_count);
	   }
	}