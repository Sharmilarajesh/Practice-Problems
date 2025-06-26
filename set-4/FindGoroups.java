/*
  🧾 Question:
📥 Given:
An array of integers, e.g., [3, 9, 7, 4, 6, 8]
A number X, e.g., X = 3

🎯 Goal:
Find all groups of:

2 or 3 elements

Such that:

The sum of the group is divisible by X

For example, if X = 3, then the group’s sum must be divisible by 3 (i.e., sum % 3 == 0)

🔍 Additional Conditions:

Only consider groups of exactly 2 or 3 numbers

From the given array, check all possible pairs and triplets

For every valid group (sum divisible by X):

Print the group

Count how many such groups you find

🧠 Let’s break it with your sample:
✨ Input:
Array: 3, 9, 7, 4, 6, 8

X = 3

🔎 What to do:
Look at all combinations of size 2 and 3.

👉 Check these 2-element combinations:
(3, 9) → 3+9 = 12 → 12 % 3 == 0 ✅

(3, 6) → 3+6 = 9 → 9 % 3 == 0 ✅

(9, 6) → 9+6 = 15 → 15 % 3 == 0 ✅

Others → not divisible by 3 ❌

👉 Check 3-element combinations:
(3, 9, 6) → 3+9+6 = 18 → 18 % 3 == 0 ✅

Others → check all and see if divisible by 3

✅ Final Answer:
3, 9  
3, 6  
9, 6  
3, 9, 6  
No of groups: 4

📦 Summary:
You're finding all 2 or 3 number groups from the array 
where the sum is divisible by the given number X, and you print and count those groups.

 */


public class FindGoroups {

	public static void main(String[] args) {
		int arr[]= {3, 9, 7, 4, 6, 8};
		int X=3;

		
		int n=arr.length;
		int count=0;
		System.out.println("Doubles:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=arr[i]+arr[j];
				if(sum%X==0) {
					System.out.println(arr[i]+" "+arr[j]);
					count++;
				}				
			}
		}
		System.out.println("Triples:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
			        int sum=arr[i]+arr[j]+arr[k];
					if(sum%X==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
				}
				
				}				
			}
		}
		System.out.println("Count: "+count);
		
		
		

	}

}
