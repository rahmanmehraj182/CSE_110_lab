import java.util.Scanner;

public class Aabc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your CGPA: ");
        double cgpa = input.nextDouble();
        String buffer = input.nextLine();


        System.out.println("Enter your Department: ");
        String department = input.nextLine();
        
        System.out.printf("Your name: %s\n", name);
        System.out.printf("Your Age: %d\n", age );
         System.out.printf("Your CGPA: %f\n", cgpa );
         System.out.printf("Your name: %s\n", department);
        
        
        
    }
}
