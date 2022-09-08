//test class of question 2
package com.looping.demo;

import java.util.Scanner;

import com.test.bll.CountDigits;
public class TestCountDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		if(n>0) {
		CountDigits c= new CountDigits();
		System.out.println("total no. of digits in:"+c.countDigits(n));
		}
		else {
			System.out.println("Invalid Input.");
		}
		sc.close();
	}

}
