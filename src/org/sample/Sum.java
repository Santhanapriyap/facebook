package org.sample;

public class Sum 
{
public static void main(String[] args) 
{
int a=54321;
int b=a;
int rem=0;
int sum =0;
while(a>0)
{
	rem=a%10;
	sum=sum+rem;
	a=a/10;
	
}
System.out.println("Sum of "+b+"is\t"+sum);
}
}
