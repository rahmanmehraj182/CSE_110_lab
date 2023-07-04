public class Lab4_3 {
    public static void main(String[] args){
        int  arr[][] =  {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4}, {3,3,4,3,3,2,2},{9,3,4,7,3,4,1}, {3,5,4,3,6,3,4,4},{3,7,4,8,3,8,4}, {6,3,5,9,2,7,9}};
        int [][] track = new int[8][2];
        int c = 0;
        for(int i = 0; i  < arr.length; ++i){
            int sum = 0;
            for(int j = 0; j <arr[i].length; ++j){
                sum += arr[i][j];
            }
            track[c][0] = sum;
            track[c][1] = i;
            c++;
        }

        for(int i = 0; i  < track.length; ++i){
            for(int j = i + 1; j< track.length; ++j){
                if(track[i][0] < track[j][0]){
                    int ii = track[i][0];
                    track[i][0]= track[j][0];
                    track[j][0]  =  ii;
                    ii = track[i][1];
                    track[i][1]= track[j][1];
                    track[j][1]  =  ii;

                }
            }
           System.out.println(track[i][0] +" " + track[i][1]);
        }

        for(int i = 0; i  < track.length; ++i){
            
           System.out.println("Employee "+track[i][1] +" has total working hours: " + track[i][0]);
        }
    }
}
