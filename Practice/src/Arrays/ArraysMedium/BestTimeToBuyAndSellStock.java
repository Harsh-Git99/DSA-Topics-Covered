package Arrays.ArraysMedium;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println( maxProfit(arr));

    }

    //Optimized
    static int maxProfit1 (int[] arr ){
        int LSF = Integer.MAX_VALUE;        //LeastSoFar
        int OP = 0;         //overallProfit
        int PIST = 0;       //profitSoFar

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < LSF){   //if we found new buy value which is smaller than previous one
                LSF = arr[i];   //update our least so far
            }
            PIST = arr[i] - LSF;    // calculating profit if sold today by, Buy - sell
            if(OP < PIST){
                OP= PIST;
            }
        }
        return OP;
    }

    //Brute Force
    static int maxProfit (int[] arr ){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(sum <  (arr[j] - arr[i] )){
                        sum = (arr[j] - arr[i] );
                    }
            }

        }
        return sum;
    }
}
