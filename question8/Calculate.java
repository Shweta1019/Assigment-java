import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the number of seconds: ");
        int totalSec = sc.nextInt();
        
        
        Time time = convertSec(totalSec);
        
       
        System.out.println("Time" + time.days + " days, " +
                           time.hours + " hours, " + time.minutes +
                           " minutes, " + time.sec + " sec");
        
    }
    
    public static Time convertSec(int totalSec) {
        
        int days = totalSec / (24 * 3600);
        int remainingSec = totalSec % (24 * 3600);
        int hours = remainingSec / 3600;
        remainingSec %= 3600;
        int minutes = remainingSec / 60 ;
        remainingSec %= 60;
        int sec = remainingSec;
        
        return new Time(days, hours, minutes, sec);
    }
}

class Time {
    int days;
    int hours;
    int minutes;
    int sec;
    
    public Time(int days, int hours, int minutes, int sec) {
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.sec = sec;
    }
}