import java.util.Scanner;

public class SpecialInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int num = scanner.nextInt();
        
        if (isSpecialInteger(num)) {
            System.out.println(num + " is a two-digit special integer.");
        } else {
            System.out.println(num + " is not a two-digit special integer.");
        }
    }
    
    public static boolean isSpecialInteger(int num) {
        if (num < 10 || num > 99) {
            return false; 
        }
        
        int tensDigit = num / 10;
        int onesDigit = num % 10;
        
        int sum = tensDigit + onesDigit + (tensDigit * onesDigit);
        
        return sum == num;
    }
}