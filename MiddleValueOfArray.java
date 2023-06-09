package JavaInterviewPrograms;

public class MiddleValueOfArray{

	   //main method
	   public static void main(String[] args){
	   
	      //Declare and initialize the array elements
	      int[] nums = new int[]{1, 6, 5, 2, 4, 21, 7, 9, 4, 6};
	       
	      //logic implementation for middle element
	      
	      //if even number of array elements are present
	      if (nums.length %2 == 0){
	         System.out.println("The middle elements are: ");
	         
	         // even-length array (two middle elements)
	         int x = nums[(nums.length/2) - 1];
	         System.out.println(x);
	         int y = nums[nums.length/2];
	         System.out.println(y);
	      } 
	      
	      //if odd number of array elements are present
	      else {
	      
	         // odd-length array (only one middle element)
	         int z = nums[nums.length/2];
	         System.out.println("The middle elements is: ");
	         System.out.println(z);
	      }
	   }
	}