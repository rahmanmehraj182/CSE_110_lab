import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int [][] arr = new int[4][4];
        int [][]track = new int[4][2];
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 4; ++j){
                int c;
                c = inp.nextInt();
                arr[i][j] = c;
            }
        }
        System.out.println("Enter the coloumn according to you want to sort the array ");
        int col = inp.nextInt();
        inp.close();
        for(int i = 0; i < 4; ++i){
            track[i][0] = arr[i][col];
            track[i][1] = i;
        }


        for(int i = 0; i < 4; ++i){
            for(int j = i + 1; j < 4; ++j){
                if(track[i][0] > track[j][0]){
                    int c = track[i][0];
                    track[i][0]  =track[j][0];
                    track[j][0] = c;
                    c = track[i][1];
                    track[i][1] = track[j][1];
                    track[j][1] = c;
                }
            }
        }


        for(int i = 0; i < 4; ++i){
            for(int j = 0; j  <4; ++j){
                System.out.print(arr[track[i][1]][j] + " ");
            }
            System.out.println();
        }


        



    }
}
