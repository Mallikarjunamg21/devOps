package JavaInterviewPrograms;

public class ReverseStringUsingStringBuilder {
	public static void main(String[] args) {
		String str = "MAHESH";
		String reversed = reverseString(str);
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
