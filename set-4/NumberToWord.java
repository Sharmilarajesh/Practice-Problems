/*
  3)

To find the print the pattern
(0-999) Input: 234 Output: Two hundred and Thirty Four
 */



public class NumberToWord {
     static String[] ones = {
		        "", "One", "Two", "Three", "Four", "Five",
		        "Six", "Seven", "Eight", "Nine", "Ten",
		        "Eleven", "Twelve", "Thirteen", "Fourteen",
		        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
		    };

		    static String[] tens = {
		        "", "", "Twenty", "Thirty", "Forty",
		        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
		    };
	public static void main(String[] args) {
		int num=234;
		System.out.println(numberToWord(num));
		
	}
	public static String numberToWord(int num) {
		if(num==0) {
			return "zero";
		}
		String result="";
		
		if(num>=100) {
			result+=ones[num/100]+" Hundred";
			num=num%100;
			if(num>0) {
				result+=" and ";
			}
		}
		if(num>=20) {
			result+=tens[num/10];
			num=num%10;
			if(num!=0) {
				result+=" "+ones[num];
			}
			else {
				result+=ones[num];
			}
		}
		
		return result;
	}

}
