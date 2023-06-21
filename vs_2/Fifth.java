import java.util.Scanner;
import java.lang.*;
import java.util.*;



public class Fifth {
    public  int HighestElement(int [] array){
        int m = 0;
        for(int i = 0; i < 100; ++i){
            if(m < array[i]){
                m = array[i];
            }
        }
        return m;
    }

    public  int LowestElement(int [] array){
        int m = 1000;
        for(int i = 0; i < 100; ++i){
            if(m > array[i]){
                m = array[i];
            }
        }
        return m;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[100];

        for(int i = 0; i < 100; ++i){
            a[i] = (int)(Math.random()*100);
        }
        Fifth l = new Fifth();
        int max = l.HighestElement(a);
        int min = l.LowestElement(a);
        System.out.println(max);
        int mai = 0, mni = 0;
        for(int i = 0; i < 100; ++i){
            if(a[i] == max){
                mai = i;
                break;
            }
        }
        for(int i = 0; i < 100; ++i){
            if(a[i] == min){
                mni = i;
                break;
            }
        }

        System.out.println("Max element is : "+ max + " and its index is "+ mai + " min element is "+ min + " and its index is: "+mni);

         
         
    }

}
