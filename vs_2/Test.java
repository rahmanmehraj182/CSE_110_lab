import java.util.Scanner;

public class Test {
   public static int max(int [] array) {
      int max = 0;

      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }

   public static int min(int [] array) {
      int min = array[0];
   
      for(int i = 0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
// 
      System.out.println("Maximum value in the array is::"+ Test.max(myArray));
      System.out.println("Minimum value in the array is::" +min(myArray));
   }
}