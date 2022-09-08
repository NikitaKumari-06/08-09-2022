//question 3
package com.test.bll;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1st no.:");
	int firstNum= sc.nextInt();
	System.out.println("Enter the 2nd no.:");
	int secondNum= sc.nextInt();
	int i;
	int sume=0;
	int sumo=0;
	if((firstNum>0)&&(secondNum>0)) {   //validation of positive no.
		if(firstNum<secondNum) {         //validation of firstnum<secondnum
			System.out.println("Even no. are-");
			for(i=firstNum;i<=secondNum;i++) {
				if(i%2==0) {
					System.out.println(i);     //print even no.
					sume+=i;
				
				}
			}
			System.out.println("sum of even no. are:"+sume);//sum of even no.
			System.out.println("odd no. are-");
		   for(i=firstNum;i<=secondNum;i++) {
			   if(i%2==1) {
				   System.out.println(i); //print odd no.
				   sumo+=i;
				   
			   }  
				
			}
		   System.out.println("sum of odd no. are:"+sumo);//sum of odd no.
		}
	}
	sc.close();
}
}

