import java.util.Scanner;

public class First {
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int n;
       System.out.println("Enter a number: ");
       n = input.nextInt();
       if(n % 2 == 0 && n % 3 == 0){
            System.out.println("False.");
       }else if(n % 2 == 0 || n % 3 == 0){
            System.out.println("True.");
       }else{
            System.out.println("False.");
       }

        
        
    }
}
