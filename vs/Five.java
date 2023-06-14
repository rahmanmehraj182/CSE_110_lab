import java.util.Scanner;

public class Five {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double p,q,r, x, y ,n, d, money  , years, rem;
       System.out.println("Enter the value of x-axis of the center of a circle: ");
       p = input.nextDouble();
       System.out.println("Enter the value of y-axis of  the center of a circle: ");
       q = input.nextDouble();
       System.out.println("Enter the radius of that circle: ");
       r = input.nextDouble();
       System.out.println("Enter the value of x-axis of  a poiunt: ");
       x = input.nextDouble();
       System.out.println("Enter the radius of y-axis  a poiunt: ");
       y = input.nextDouble();
       d = Math.sqrt(Math.pow((p - x), 2.0) +Math.pow((p - x), 2.0) );
       if(d > r){
            System.out.println("The point "+ "("+x+","+y+") "+" is outside of the circle");
       }else{
        System.out.println("The point "+ "("+x+","+y+") "+" is inside of the circle");
       }
        
    }
}
