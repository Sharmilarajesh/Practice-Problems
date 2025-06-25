/*
  1) To find the odd numbers in between the range. 
  
  Input: 2 15 
  Output: 3,5,7,9,11,13
  
 */


package basic.java;

public class PrintOddNumbers {

	public static void main(String[] args) {
		int m=2;
		int n=15;
	    printOddNumbers( m, n);
		
	}
	public static void printOddNumbers(int m,int n) {
		
		for(int i=m;i<n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
