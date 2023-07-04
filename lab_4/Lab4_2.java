import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args){
        String userPass;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a password:");
        userPass = inp.next();
        boolean f = false;
        int dc =  0;
        inp.close();
        if(userPass.length() <8)f = true;
        for(int i = 0; i < userPass.length(); ++i){
            char c = userPass.charAt(i);
            if((c>='a' && c <= 'z') || (c>='A' && c <= 'Z') || c>='0' && c <= '9'){

            }else{
                f = true;
                break;

            }
            if(c >='0' && c <='9')dc++;
        }
        if(dc <2)f = true;

        if(!f)System.out.println("Valid Pass!");
        else System.out.println("Invalid  Pass!");

    }
}
