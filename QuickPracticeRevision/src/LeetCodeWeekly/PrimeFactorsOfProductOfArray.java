package LeetCodeWeekly;

import java.util.HashSet;

public class PrimeFactorsOfProductOfArray {
    public static void main(String[] args) {
        int[] arr = {2,14,19,19,5,13,18,10,15,20};

        System.out.println(distinctPrimeFactors(arr));
    }

    static int distinctPrimeFactors(int[] nums) {
        int prod = 1;


        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int ele : nums){
            set.add(ele);
        }

        for (Integer ele : set){
            prod *= ele;
        }


        int i = 2;
        while(prod!= 1){
            while(prod%i == 0){
                prod = prod/i;
                set2.add(i);
            }
            i++;
        }
        return set2.size();
    }
}
