package com.wipro.eb.exception;
import java.util.Scanner;
public class Powersum {
public static void main(String args[]){
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int no ;
no=sc.nextInt();
int ans=0;
while(no>0)
{
a=no%10;
no=no/10;
int b=no%10;
ans=(int)(ans+Math.pow(a, b));
}
System.out.println("power is"+ans);
}
}
