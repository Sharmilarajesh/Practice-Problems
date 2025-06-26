/*
  2) To find the factors of the numbers given in an array
   and to sort the numbers in descending order according to 
   the factors present in it. 
   Input: Given array : 8, 2, 3, 12, 16 
   Output: 12, 16, 8, 2, 3 
 */


import java.util.*;
public class FindAndSortFactors {
	public static void main(String[] args) {
		int arr[]= {8, 2, 3, 12, 16 };
	    sortFactors(arr);
	
	}
	public static void sortFactors(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int f1=countFactors(arr[i]);
				int f2=countFactors(arr[j]);
				
				if(f2>f1) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}				
			}			
		}
		for(int num:arr) {
			System.out.print(num+", ");
		}	
	}
	
	public static int countFactors(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}

}
