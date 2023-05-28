package Recursion3_Arrays;

import java.util.ArrayList;

public class Q2_LinearSearch {
    public static void main(String[] args) {
        int [] arr = {3,2,1,18,18,18,9,18};

        int [] arr2 = {1,5,5,2,5,6,7,8,8,8};

        //System.out.println(getTarget(arr,18,0));

        getAllTargets(arr, 18,0);
        System.out.println(list2);

        System.out.println("----------------------------");
        ArrayList<Integer> ans= getAllTargets2(arr2, 5, 0, new ArrayList<Integer>());
        System.out.println(ans);
        System.out.println("----------------------------");


        System.out.println(ListWithoutArguments(arr2, 8, 0 ));

    }


    static int getTarget(int[] arr, int target, int i){
        if(i > arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else
          return   getTarget(arr, target , i+1);
    }


    //To get all the target indices
    static ArrayList<Integer> list2 = new ArrayList<Integer>();

    static void getAllTargets(int[] arr, int target, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i]==target){
            list2.add(i);
            //getAllTargets(arr, target, i + 1);
        }
            getAllTargets(arr, target, i + 1);

    }

    //OR

    //when recursion has return type ARRAYLIST
    static ArrayList getAllTargets2(int[] arr, int target,int i, ArrayList<Integer> list ){
        if(i == arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
            //getAllTargets(arr, target, i + 1);
        }
        return getAllTargets2(arr, target, i + 1, list);

        //All these list-variables are all different reference variables
        //thatis. same name  but different ref-variables at diff function calls
        //all of them are pointing to same OBJECT.

    }

    //Return the List without passing the ARGUMENT.
    //(i.e. create the list in the body of the function)

    //This approach creates objects again and again increasing timeComplexity

    static ArrayList<Integer> ListWithoutArguments(int[] arr, int target,int i ) {

        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length) {
            return list;
        }

        // this will have answer for that function call only
        if (arr[i] == target) {
            list.add(i);
            //getAllTargets(arr, target, i + 1);
        }
        ArrayList<Integer> ansFromBelowCalls = ListWithoutArguments(arr,target,i+1);
        //whatever is the answer from below calls are coming and getting into ansFromBelowCalls

        // and values in the ansFromBelowCalls is getting stored in the list here
        list.addAll(ansFromBelowCalls);// now list has all the answers we have till now

        return list;

    }
}
