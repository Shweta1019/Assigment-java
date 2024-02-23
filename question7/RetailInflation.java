import java.util.Scanner;

public class RetailInflation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the rate of retail inflation (in percentage): ");
        double inflationRate = scanner.nextDouble() / 100.0; 
        
        
        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();
        
        
        double compoundedInflation = 1 + inflationRate;
        for (int i = 1; i < numYears; i++) {
            compoundedInflation *= (1 + inflationRate);
        }
        
        
        System.out.printf("Compounded retail inflation after %d years: %.2f%%\n", numYears, ((compoundedInflation - 1) * 100));
    }
}

