import java.util.Scanner;

public class Second {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       long  n,days , years, rem;
       System.out.println("Enter the number of minutes: ");
       n = input.nextLong();
       days = n / 1440;
       years = days / 365;
       days =days % 365;

       System.out.println(n + " minutes is approximately " + years + "years and "+ days + "days") ;


       

        
        
    }
}
