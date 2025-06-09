/*
  Run Length Encoding

Given a string s, Your task is to complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

Example 1:

Input:
s = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times consecutively b 3 times, c also 3 times.
Example 2:

Input:
s = abbbcdddd
Output: a1b3c1d4
Explanation:  a repeated 1 time, b 3 times, c 1 time and d repeated 4 times.

 */

 class Solution {
    public static String encode(String s) {

       StringBuilder sb=new StringBuilder();
       int count=1;
       char charArray[]=s.toCharArray();
       
       for(int i=1;i<charArray.length;i++){
           if(charArray[i-1]!=charArray[i]){
               sb.append(charArray[i-1]);
               sb.append(Integer.toString(count));
               count=1;
           }
           else{
               count++;
           }
       }
       sb.append(charArray[charArray.length-1]);
       sb.append(Integer.toString(count));
       return sb.toString();
        
    }
}

