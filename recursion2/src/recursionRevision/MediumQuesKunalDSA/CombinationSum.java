package recursionRevision.MediumQuesKunalDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;
        int[] ans = new int[arr.length];

        System.out.println(combinationSum(arr,target,0, ans));

    }

    static List<List<Integer>> combinationSum(int[] candidates, int target, int sum, int[] ans) {
        if(sum == target){
            List<Integer> l1 = new ArrayList<>();
            for (int i = 0; i < ans.length; i++) {
                l1.add(ans[i]);
            }
            List<List<Integer>> list = new ArrayList<>();
            list.add(l1);
        }

        if(sum > target){
            List<List<Integer>> list = new ArrayList<>();
            return list;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= ans.length; i++) {
            ans[i] = candidates[i];
            sum += candidates[i];
            list.addAll( combinationSum(candidates,target,sum, Arrays.copyOfRange(candidates,i,i+1)));
        }
        return list;
    }
}
