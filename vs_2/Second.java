import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[101];
        System.out.println("Enter the integers between 1 and 100: ");
        while(true){
            int x =  input.nextInt();
            if(x == 0)break;
            a[x]++;
        }
        input.close();

        for(int i = 0; i < 101; ++i){
            if(a[i] > 0){
                if(a[i] > 1){
                    System.out.println(i + " occurs "+ a[i] + " times");
                }else{
                    System.out.println(i + " occurs "+ a[i] + " time");
                }
            }
        }
         
         
    }
}
