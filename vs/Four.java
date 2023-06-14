import java.util.Scanner;

public class Four {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int  n, money  , years, rem;
       System.out.println("Enter 0 if you want to convert USD to BDT and  1 if you want BDT to USD: ");
       n = input.nextInt();
       if(n == 0){
            System.out.println("Enter the amount of USD :");
            money = input.nextInt();
            System.out.println(money + " USD is equivalent to " + money * 80 + "BDT");

       }else{
        System.out.println("Enter the amount of BDT :");
            money = input.nextInt();
            System.out.println(money + " BDT is equivalent to " + money / 80 + "USD");
       }
        
    }
}
