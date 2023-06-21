import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int a[]  = new int[100];
        int i = 0;
        while(n > 0){
            int r = n % 10;
            a[i] = r;
            i++;
            n /= 10;

        }
        int f =0;
        for(int j = 0; j <i/2 ;++j){
            if(a[j] != a[i - j - 1])f =1;

        }
        if( f== 0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

         
         
    }   
}
