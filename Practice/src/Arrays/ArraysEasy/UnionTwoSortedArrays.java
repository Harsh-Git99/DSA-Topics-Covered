package Arrays.ArraysEasy;

import java.util.Arrays;

public class UnionTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(Arrays.toString(union(arr1,arr2)));
    }

    static int[] union (int[] a1, int[] a2){
        int [] temp = new int[a1.length+a2.length];
        int k =0, i = 0, j = 0;

        while(i < a1.length && j < a2.length) {
            if (a1[i] == a2[j]) {
                if (temp[k] != a1[i]) {
                    temp[k] = a1[i];
                    k++;
                    i++;
                }
            } else if (a1[i] < a2[j]) {
                if (temp[k] != a1[i]) {
                    temp[k] = a1[i];
                    k++;
                    i++;
                }
            } else if (a1[i] > a2[j]) {
                if (temp[k] != a2[i]) {
                    temp[k] = a2[j];
                    k++;
                    j++;
                }
            }
        }
        return temp;
        }

    }

