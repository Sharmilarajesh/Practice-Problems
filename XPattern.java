/*
1. Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

*/



public class XPattern {
	public static void main(String args[]) {
		String word="PROGRAM";
		char charArray[]=word.toCharArray();
		int n=charArray.length;
		for(int i=0;i<n;i++) {	
			for(int j=0;j<n;j++) {
				if(i==j || (n-1)==i+j) {
					System.out.print(charArray[j]);
				}	
				else {
					System.out.print("  ");
				}
		    }
			System.out.println();	
	    }	
		
	}
}

/*

output

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

 */




