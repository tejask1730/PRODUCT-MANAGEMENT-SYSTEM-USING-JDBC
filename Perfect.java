package logicalprogramming;

import java.util.Scanner;

public class Perfect {
	public boolean isPerfect(int n){
		int sum=0;
		//to find the factors
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==n) {
			return true;
			
		}else {
			return false;
		}
		
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Perfect p=new Perfect();
		System.out.println(p.isPerfect(n));
		
	}
	

}
