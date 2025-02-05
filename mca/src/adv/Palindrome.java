package adv;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a number");
		 int sum=0,m, rem,n;
		 n=sc.nextInt();
		  m=n;
		while(n>0) {
			 rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}
		if(m==sum)
			System.out.println(m+" is a palindrome");
		else
			System.out.println(m+" is not a palindrome");
		 
   sc.close();
	}

}
;