import java.util.Scanner;
public class Forth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Enter 10 Numbers: ");

        for(int i = 0; i < 10; ++i){
            int x = input.nextInt();
            a[i] = x;

        }
        int ind = 0;
        for(int i = 0; i < 10; ++i){
            if(ind == 0){
                b[ind] = a[i];
                ind++;
            }else{
                int f = 0;
                for(int j = 0; j < ind; ++j){
                    if(b[j] == a[i]){
                        f = 1;
                        break;
                    }
                }
                if(f == 0){
                    b[ind] = a[i];
                    ind++;
                }
            }
        }

        System.out.println("Distinct Values: ");
        for(int j = 0; j < ind; ++j){
            System.out.println(b[j] + " ");
        }
         
         
    }
}
