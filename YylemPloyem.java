package logicalprogramming;

import java.util.Scanner;

public class YylemPloyem{
	public static String isYylemPloyem(int n){
		int temp=n;int count1=0;int count2=0;
		int sum1=0;int sum2=0;
		//count the no of digits
		while(n>0) {
			n=n/10;
			count1++;
			
		}
		//to perform sum operation
		while(temp>0) {
		int lastdigit=temp%10;
		count2++;
		if(count2==1||count1==count2) {
			sum1=sum1+lastdigit;
			
		}
		else {
		     sum2=sum2+lastdigit;
		 
		}
		    temp=temp/10;
	}
		if(sum1==sum2) {
			return "it is xylem";
			
		} 
		else {
			return "it is ployem";
	     }
	}
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		String result=isYylemPloyem(n);
		System.out.println(result);
		}
	}
