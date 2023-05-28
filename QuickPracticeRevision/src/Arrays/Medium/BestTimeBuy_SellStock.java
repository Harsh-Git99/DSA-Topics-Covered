package Arrays.Medium;

public class BestTimeBuy_SellStock {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,8,3,9};

        //most optimised 99%
        System.out.println(maxProfit2(arr));


        //88%
        System.out.println(maxProfit1(arr));
        
    }

    //most optimised 99%
    static int maxProfit2(int[] arr){
        int minPriceToBuy = Integer.MAX_VALUE;
        int cp = 0;
        int tp = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minPriceToBuy){
                minPriceToBuy = arr[i];
            }
            cp = arr[i] - minPriceToBuy;

            tp = Math.max(cp,tp);
        }
        return tp;

    }


    // 88%
    static int maxProfit1(int[] arr){
        int i = 0;
        int j = 1;
        int tP = 0;
        int cP = 0;
        while(j<arr.length){
            cP = arr[j] - arr[i];
            tP = Math.max(cP,tP);
            if(cP < 0){
                i=j;
            }
            j++;
        }
        return tP;
    }
}
