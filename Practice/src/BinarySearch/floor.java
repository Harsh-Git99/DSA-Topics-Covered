package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {66 ,67 ,68 ,69 ,70 ,71 ,72 ,73 ,74, 75, 76 ,77 ,78 ,79 ,80 ,81 ,82 ,83 ,84 ,85 ,86 ,87 ,88 ,89 ,90 ,91 ,92 ,93 ,94, 95, 96, 97, 98, 99 ,100 ,101 ,102 ,103 ,104 ,105 ,106 ,107 ,108 ,109 ,110, 111 ,112, 113, 114, 115, 116 ,117 ,118 ,119 ,120, 121, 122, 123, 124, 125, 126, 127 ,128 ,129 ,130};
        int targt = 106;

        int[] arr2 = {1,3,5,6};
        int target = 2;

        System.out.println(floor(arr2,target));


    }
    static int  floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(target <= arr[0]){
            return -1;
        }

        while (start<=end){
            int mid = start + (end -start)/2;

            if (arr[mid] < target){
                start = mid +1;
            } else if (arr[mid]>target) {
                end = mid-1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        if(start>end){
            return start;
        }
        return end;
    }
}
