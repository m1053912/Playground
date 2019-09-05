package Analysis.com;

import java.util.StringTokenizer;

public class Operations {
	public static int max(int arr[]) {
		 int max=arr[0];//arr[0] instead of 0  
	     for(int i=1;i<arr.length;i++){  
	         if(max<arr[i])  
	             max=arr[i];  
	     }  
	     return max;  
	 }  
	public static int cube(int n) {
		return n*n*n;
	}
	 public static String reverseWord(String str){ 
		 String input1;
		 StringBuilder input = new StringBuilder(); 
		 input.append(str);
		 input=input.reverse();
		 input1=input.toString();
		 return input1;

}
}
