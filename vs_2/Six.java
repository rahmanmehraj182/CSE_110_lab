import java.util.Scanner;
public class Six {
    static class Student {
        
        public String name;
        public int score;

        Student(String n, int s){
            this.name = n;
            this.score = s;

        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n = input.nextInt();
        String c = input.nextLine();
        Student arr[] = new Student[n];
        for(int i = 0; i < n; ++i){
            String name;
            int score;
            System.out.println("Enter Student name" );
            name = input.nextLine();
            System.out.println("Enter Student score" );
            score = input.nextInt();
            String cc = input.nextLine();
            // Six l = new Six();
            arr[i] = new Student(name, score);
        }

        for(int i = 0; i < n - 1; ++i){
            for(int j = i +1; j < n; ++j){
                if(arr[i].score < arr[j].score){
                    int sc = arr[i].score;
                    arr[i].score =  arr[j].score;
                    arr[j].score = sc;
                    String name = arr[i].name;
                    arr[i].name =  arr[j].name;
                    arr[j].name = name;
                }
            }
        }

        for(int j =  0; j < n; ++j){
                System.out.println("Name of Student "+ j + arr[j].name + " and score is: "+ arr[j].score);
            }
         
         
    }
}
