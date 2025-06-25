/*
   4) Check whether a given mathematical expression is valid.

    Eg.) Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid 
 */


import java.util.Stack;
public class CheckValidExpression {
	public static void main(String[] args) {
		
		String str1="(a+b)(a*b)";
		String str2="(ab)(ab+)";
		String str3="((a+b)";
		System.out.println(checkValidExpression(str1));
		System.out.println(checkValidExpression(str2));
		System.out.println(checkValidExpression(str3));

	}
	public static boolean checkValidExpression(String str) {
		
		Stack<Character> stack=new Stack<>();
		String operators="+-*/";
		int n=str.length();
		
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			
			if(ch=='(') {
				stack.push(ch);
			}
			else if(ch==')') {
				if(stack.isEmpty())  return false;
				stack.pop();		
			}	
			if(operators.indexOf(ch)!=-1) {
				
				if(i==0 || i==n-1) return false;
				
				char prev=str.charAt(i-1);
				char next=str.charAt(i+1);
				
				if(operators.indexOf(prev)!=-1 || prev=='(') return false;
				if(operators.indexOf(next)!=-1 || next==')') return false;				
			}
		}
		return stack.isEmpty();	
	}

}
