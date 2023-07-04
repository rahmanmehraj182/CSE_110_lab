public class Lab4_1 {
    public static void main(String[] args)
    {
        int [][] a =new int[4][4];
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 4; ++j){
                a[i][j] = (int)(Math.random()*(2) %2);
            }
        }
        int  rc = 0,rl = 0;

        for(int i = 0; i < 4; ++i){
            int cr = 0, cl = 0;
            for(int j = 0; j < 4; ++j){
                // a[i][j] = (int)Math.random()*2 %2;
                if(j > 0 &&a[i][j] == 1 && a[i][j-1] == 1){
                    if(cr ==0 )cr = 2;
                    else cr++;
                    rc = Math.max(rc, cr);
                }else if( j > 0 && (a[i][j] == 1 )){
                    cr = 1;
                    rc = Math.max(rc, cr);
                } else{
                    cr = 0;
                    rc = Math.max(rc, cr);
                }

                if(i > 0 && a[j][i] == 1 && a[j][i-1] == 1){
                    if(cl ==0 )cl = 2;
                    else cl++;
                    rl = Math.max(rl, cl);
                }else if(i > 0 && (a[j][i] == 1 )){
                    cl = 1;
                    rl = Math.max(rl, cl);
                }else{
                    cl = 0;
                    rl = Math.max(rl, cl);
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("The Largest row index is : " + rc);
        System.out.println("The Largest coloumn index is : " + rl);


    }
}
