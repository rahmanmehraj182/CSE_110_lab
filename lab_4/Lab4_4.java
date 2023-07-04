import java.util.Scanner;
public class Lab4_4 {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int n;
       System.out.println("Enter a number: ");
       n = inp.nextInt();
       String[] str = new String[n];
       inp.nextLine();
       for(int i = 0; i < n; ++i){
            String a;
            a = inp.nextLine();
            str[i] = a;
       }
       inp.close();
       System.out.println();
       for(int i = 0; i < n; ++i){
        for(int j = 0; j < n; ++j){
            int f = stringCompare(str[i],str[j]);
            if(f < 0){
                String c = str[i];
                str[i] = str[j];
                str[j] = c;
            }
        } 
       }

       for(int i = 0; i < n; ++i){
        System.out.println(str[i]);
       }

    }

    public static int stringCompare(String str1, String str2)
    {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        if (l1 != l2) {
            return l1 - l2;
        }
  
        else {
            return 0;
        }
    }
}
