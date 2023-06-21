import java.util.Scanner;

public class First {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int n, best = 0;
       System.out.println("Enter the number of students: ");
       n = input.nextInt();
       int a[]=new int[n];

       System.out.println("Enter " + n + " scores: ");
       for(int i = 0; i < n; ++i){
            int x = input.nextInt();
            a[i] = x;
            if(x > best){
                best = x;
            }

       }
       input.close();
       for(int i = 0; i < n; ++i){
            int d = a[i];
            if(d >= best - 10){
                System.out.println("Student " + i + " score is " + d + " and grade is "+ "A" );
            }else if(d >= best - 20){
                System.out.println("Student " + i + " score is " + d + " and grade is "+ "B" );
            }else if(d >= best - 30){
                System.out.println("Student " + i + " score is " + d + " and grade is "+ "C" );
            }else if(d >= best - 40){
                System.out.println("Student " + i + " score is " + d + " and grade is "+ "D" );
            }else{
                System.out.println("Student " + i + " score is " + d + " and grade is "+ "F" );
            }
       }


       
        
        
   }
}
