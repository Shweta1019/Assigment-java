


import java.util.Scanner;


// 1-Write a program that prints the number of digits in an integer. 
//



class Count
{
public static void main(String[] args){
int n,count=0;
System.out.println("Enter any number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
n=n/10;
count++;
}
System.out.println("number of digits"+count); 
}
} 