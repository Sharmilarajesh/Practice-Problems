/*
 
 2) Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab) 
 */


import java.util.*;
public class RemoveUnbalancedParentheses {

	public static void main(String[] args) {
		String str1="((abc)((de))";
		String str2="(((ab)";
		System.out.println(removeUnbalancedParentheses(str1));
		System.out.println(removeUnbalancedParentheses(str2));		
	}
	
	public static String removeUnbalancedParentheses(String str) {
		int n=str.length();
		Stack<Integer> st=new Stack<>();
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			
			if(ch=='(') {
				st.push(i);		
			}
			else if(ch==')') {
				if(!st.isEmpty()) {
					st.pop();
				}
				else {
					set.add(i);
				}
			}
		}
		
		while(!st.isEmpty()) {
			set.add(st.pop());
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			
			if(!set.contains(i)) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

}
