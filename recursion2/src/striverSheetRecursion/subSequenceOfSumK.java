package striverSheetRecursion;

import java.util.ArrayList;
import java.util.List;

public class subSequenceOfSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;

        System.out.println(getK(arr,k));
    }
    static int count = 0;
    static List<List<Integer>> getK(int[] arr, int k){
        List<List<Integer>> wrap = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

      //  helper(arr,list,0,k,0);

        helperOne(arr,list,wrap,0,k,0);

        return wrap;
    }



    static void helper(int[] arr, List<Integer> list,  int sum , int k, int index){

        if(index == arr.length){
            if(sum == k){
                //wrap.add(new ArrayList<>(list));
                count = count +1;
            }
            return;
        }

        //pick
        list.add(arr[index]);
        sum += arr[index];
        helper(arr,list,sum,k,index+1);

        list.remove(list.size()-1);
        sum = sum - arr[index];


        //not pick
        helper(arr,list,sum,k,index+1);

    }


    static boolean helperOne(int[] arr, List<Integer> list, List<List<Integer>> wrap ,  int sum , int k, int index){

        if(index == arr.length){
            if(sum == k){
                wrap.add(new ArrayList<>(list));
                return true;
            }
            else return false;
        }

        //pick
        list.add(arr[index]);
        sum += arr[index];
        if(helperOne(arr,list,wrap,sum,k,index+1)) return true;
        else {
            list.remove(list.size() - 1);
            sum = sum - arr[index];

           if( helperOne(arr, list, wrap, sum, k, index + 1)) return true;


        }return false;





    }
}
