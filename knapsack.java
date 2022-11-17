import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        double max;
        int i,j,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Maximum Weight:");
        max = scan.nextDouble();
        System.out.println("Enter size of array:");
        n = scan.nextInt();

        double weight,temp, profit;
        double[] v = new double[n];
        double[] w= new double[n];
        double[] vw = new double[n];
        double[] vwi = new double[n];
        double[] x = new double[n];
        double[] vi = new double[n];
        double[] wi = new double[n];

        System.out.println("Enter Value for "+n+" weight:");
        for (i=0;i<w.length;i++)
        {
            w[i] = scan.nextDouble();
        }

        System.out.println("Enter Value for "+n+" profit/ Value:");
        for (i=0;i<w.length;i++)
        {
            v[i] = scan.nextDouble();
        }

        for(i=0;i<vw.length;i++)
        {
            vw[i] = (v[i] / w[i]);

            vwi[i] = vw[i];
        }

        for(i=0;i<vw.length;i++)
        {
            for(j=i+1;j<vw.length;j++)
            {
                temp = 0;
                if(vw[j] > vw[i])
                {
                    temp = vw[i];
                    vw[i] = vw[j];
                    vw[j] = temp;
                }
            }
        }

        for(i=0;i<vw.length;i++)
        {
            for (j=0;j<vw.length;j++)
            {
                if(vw[i] == vwi[j])
                {
                    vi[i] = v[j];
                    wi[i] = w[j];
                }
            }
        }
        weight = 0;
        profit = 0;
        for (i=0;i<vw.length;i++)
        {
            if((weight + wi[i]) <= max)
            {
                x[i] = 0;
                weight += wi[i];
                profit += vi[i] + x[i];
            }
            else
            {
                x[i] = (max - weight) / wi[i];
                weight = max;
                profit += vi[i] * x[i];
            }
        }

        System.out.println("Total Weight:"+ weight);
        System.out.println("Total Profit:"+ profit);


    }
}
