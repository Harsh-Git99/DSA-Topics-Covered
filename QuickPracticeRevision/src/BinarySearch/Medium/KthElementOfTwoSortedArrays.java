package BinarySearch.Medium;

import java.util.Stack;

public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
       int[] arr1 = {2, 3, 6, 7, 9};
       int[] arr2= {1, 4, 8, 10};
        int k = 5;

        System.out.println(KthElement(arr1,arr2,k));
    }





















    // time complexity O(k)
    static int KthElement(int[] arr1, int[] arr2, int k){
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int j = 0;
        while (stack.size() < k) {
            if(arr1[i] <= arr2[j]){
                stack.push(arr1[i]);
                i++;
            }else{
                stack.push(arr2[j]);
                j++;
            }
            if(i == arr1.length){
                while(j != arr2.length && stack.size() < k){
                    stack.push(arr2[j]);
                    j++;
                }
            } else if(j == arr2.length) {
                while (i != arr1.length && stack.size() < k) {
                    stack.push(arr1[i]);
                    i++;
                }
            }
        }

        return stack.pop();
    }
}
