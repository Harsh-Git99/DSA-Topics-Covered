package recursion.BasicsChap1;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,9,1,18,9,9,8};
        int target = 9 ;
       // System.out.println(search(arr,target,0));
      //  System.out.println(  searchALlIndex_Argument(arr,target,0, list));
        //System.out.println(list);
        System.out.println(searchALlIndex_insideBody(arr, target,0));
    }

    //passing the list into argument
    static ArrayList<Integer> searchALlIndex_Argument(int[] arr, int target, int count, ArrayList<Integer> list ) {
        if (count == arr.length) {
            return list;
        }
        if (arr[count] == target) {
            list.add(count);
        }
        return searchALlIndex_Argument(arr, target, ++count, list);
    }

    //Return the list by creating it inside the body(i.e. not taking it in argument)

    static ArrayList<Integer> searchALlIndex_insideBody(int[] arr, int target, int count ) {
        ArrayList<Integer> list = new ArrayList<>();    //new list will be created with each function call.
        if (count == arr.length) {
            return list;
        }
        //this list will contain answer for that individual function call only.
        if (arr[count] == target) {
            list.add(count);
        }
        ArrayList<Integer> ansFromBelowCalls =  searchALlIndex_insideBody(arr, target, ++count);
        list.addAll( ansFromBelowCalls);
        return list;
    }



    static int search(int[] arr, int target, int count){
        if(count == arr.length){
            return -1;
        }
        if (arr[count] == target){
            return count;
        }
            return search(arr,target,++count);
    }

    static   ArrayList<Integer> list = new ArrayList<>();
    static void searchALlIndex1(int[] arr, int target, int count){
        if(count == arr.length){
            return;
        }
        if (arr[count] == target){
            list.add(count);
        }
        searchALlIndex1(arr,target,++count);
    }

}
