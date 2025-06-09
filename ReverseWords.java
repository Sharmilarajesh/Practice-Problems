/*
  Reverse Words

Given a string s, reverse the string without reversing its individual words. Words are separated by spaces.

Note: The string may contain leading or trailing spaces, or multiple spaces between two words. The returned string should only have a single space separating the words, and no extra spaces should be included.

Examples :

Input: s = " i like this program very much "
Output: "much very program this like i"
Explanation: After removing extra spaces and reversing the whole string (not individual words), the input string becomes "much very program this like i". 
Input: s = " pqr mno "
Output: "mno pqr"
Explanation: After removing extra spaces and reversing the whole string, the input string becomes "mno pqr". 
 */

 class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        s=s.trim();
        String stringArray[]=s.split("\\s+");
        int n= stringArray.length;
        int left=0;
        int right=n-1;
        while(left<right){
            String temp=stringArray[left];
            stringArray[left]=stringArray[right];
            stringArray[right]=temp;
            left++;
            right--;
            
        }
        return String.join(" ",stringArray);
        
        
    }
}
