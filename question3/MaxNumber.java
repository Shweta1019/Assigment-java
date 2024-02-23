import java.util.Scanner;
class MaxNumber
{
public static void main(String[] args){
Scanner s=new Scanner(System.in);

System.out.println("Enter the first number");

int n1=s.nextInt();
System.out.println("Enter the second number");

int n2=s.nextInt();
int result=Max(n1,n2);
 System.out.println("The larger number is: " + result);
}
 public static int Max(int n1, int n2) {
        
        return n1 > n2 ? n1 : n2;
}
} 