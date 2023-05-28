package Arrays.Medium;

public class StockBuy_Sell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit1(arr));
    }


    static int maxProfit1(int[] arr){
        int leastSoFar = Integer.MAX_VALUE;
        int profitSoFar = 0;
        int overAllProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(leastSoFar > arr[i]){
                leastSoFar = arr[i];
            }
            profitSoFar = arr[i] - leastSoFar ;

            if(profitSoFar > overAllProfit){
                overAllProfit = profitSoFar;
            }
        }
        return overAllProfit;
    }


    static int maxProfit(int[] arr){
        int sum = 0, maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[j] - arr[i];
                if(sum > maxProfit){
                    maxProfit = sum;
                }
            }
        }
        if(maxProfit < 0){
            return 0;
        }else return maxProfit;
    }
}
