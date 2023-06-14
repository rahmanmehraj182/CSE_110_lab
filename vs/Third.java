import java.util.Scanner;
import java.lang.Math;

public class Third {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double a, b ,c, discriminant;
       System.out.println("Enter First Number: ");
       a = input.nextDouble();
       System.out.println("Enter Second Number: ");
       b = input.nextDouble();
       System.out.println("Enter Third Number: ");
       c = input.nextDouble();
       input.close();

       discriminant = Math.pow(b,2) - 4*a*c;
       if(discriminant == 0){
            double r = -b / 2 * a;
            System.out.println("The Root is : "+ r);
       }else if(discriminant < 0){
             System.out.println("The equation has no real roots");
       }else{
            double r1 = (-b  + Math.sqrt(discriminant))/ 2*a;
             double r2 = (-b  - Math.sqrt(discriminant))/ 2*a;
            System.out.printf("The equation has two Roots  : %.6f and %.5f ", r1, r2);
       }

       




       

        
        
    }
}
