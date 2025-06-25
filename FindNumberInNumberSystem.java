/*
  Form a number system with only 3 and 4. 
  Find the nth number of the number system. 
  Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 
  334, 343, 344, 433, 434, 443, 444, 3333, 3334, 
  3343, 3344, 3433, 3434, 3443, 3444 ....
  
  input : n=5
  output: 43
 */


import java.util.*;
public class FindNumberInNumberSystem {
	public static void main(String[] args) {
		int n=5;
		System.out.println(findNumberInNumberSystem(n));
		
	}
	public static String findNumberInNumberSystem(int n) {
		Queue<String> queue=new LinkedList<>();
		queue.add("3");
		queue.add("4");
		int count=0;
		
		while(!queue.isEmpty()) {
			System.out.println("The Number Sequence is "+queue);
			String current=queue.poll();
			count++;
			
			if(count==n) {
				return current;
			}
			queue.add(current+"3");
			queue.add(current+"4");
		}
		
		return "";
		
		
	}

}
