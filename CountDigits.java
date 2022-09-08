//question 2 
package com.test.bll;
public class CountDigits {
	
	public int countDigits(int n) {
		int count=0;
		while(n>0) {
			count+=1;
			n=n/10;
		}
		return count;
	}
}
		


	



