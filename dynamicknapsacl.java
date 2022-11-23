import java.util.Scanner;

public class dynamicknapsacl {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("how many product you have?");
            int n = sc.nextInt();
            System.out.println("enter knapsack capacity");
            int W = sc.nextInt();
            System.out.println("enter weight and value respectivily");
            int w[] = new int[n+1];
            int v[] = new int[n+1];
            int c[][] = new int[n+1][W+1];

            w[0]=0;
            v[0]=0;
            for(int i=1;i<n+1;i++){
                w[i]=sc.nextInt();
                v[i]=sc.nextInt();
            }

            for(int i=0;i<n+1;i++){
                for(int j=0;j<W+1;j++){
                    if( i==0 || j==0 ){
                        c[i][j]=0;
                    }else{
                        if(j-w[i]>=0)
                            c[i][j] = Math.max(c[i-1][j],c[i-1][j-w[i]]+v[i]);
                        else
                            c[i][j] = c[i-1][j];
                    }
                }
            }
            for(int i=0;i<n+1;i++){
                for(int j=0;j<W+1;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("max profit is:"+c[n][W]);
        }
    }
