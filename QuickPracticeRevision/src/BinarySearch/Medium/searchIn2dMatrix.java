package BinarySearch.Medium;

public class searchIn2dMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 34 ;

        System.out.println(search2(arr,target));
    }

    static boolean search2 (int[][]arr, int target){
        int row = 0;
        int eCol = arr[0].length-1;

        while(row < arr.length && eCol >= 0){
            if(arr[row][eCol] == target){
                return true;
            }else if(arr[row][eCol] < target){
                row++;
            } else if (arr[row][eCol] > target) {
                eCol--;
            }
        }
        return false;
    }

    static boolean search(int[][] arr, int target){
        int sRow = 0;
        int eRow = arr.length-1;
        int sCol = 0;
        int eCol = arr[0].length-1;
        while(sRow <= eRow){
            if(arr[sRow][eCol] < target){
                sRow++;
            }else{
                int st = sCol;
                int end = eCol;
                while(st<= end){
                    int mid = st + (end-st)/2;
                    if(arr[sRow][mid] == target){
                        return true;
                    }else if(arr[sRow][mid] < target){
                        st = mid+1;
                    }else end = mid-1;
                }
            }
        }
        return false;
    }
}
