/*
  1)
Alternative Sorting

Given an array arr of distinct integers. Rearrange the array in such a way that the 
first element is the largest and the second element is the smallest, the third element 
is the second largest and the fourth element is the second smallest, and so on.


Examples:

Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
Output: [7, 1, 6, 2, 5, 3, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2]
Output: [9, 1, 8, 2, 7, 3, 6, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
 */

//Using array

package array.java;

import java.util.*;
public class AlternateSorting {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7};
		int[] result=alternateSorting(arr1);
		System.out.println(Arrays.toString(result));
				
	}
	public static int[] alternateSorting(int arr[]) {
		//Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i-1;j++) {				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
		}
		
		
        int start=0;
        int end=n-1;
        int result[]=new int[n];
        int index=0;
      
        while(start<=end) {
        	if(index<n) {
        		result[index]=arr[end];
        		index++;
        		end--;
        	}
        	if(index<n) {
        		result[index]=arr[start];
        		index++;
        		start++;
        	}
        }
        
        return result;	
	}

}


/*
 
  Using List

  
class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        int start = 0;
        int end = n - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while (start <= end) {
            result.add(arr[end--]); 
            if (start <= end) {
                result.add(arr[start++]); 
            }
        }

        return result;
    }
}


 */
