public class Largest {
    public static void main(String[] args) {
        
        int[] numbers = {10, 5, 20, 8, 15};
        
       
        int secondLargest = findSecondLargest(numbers);
        
        
        System.out.println("The second largest number is: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] arr) {
       
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        
        for (int num : arr) {
            
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
           
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}