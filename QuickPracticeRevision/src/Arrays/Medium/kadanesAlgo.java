package Arrays.Medium;

public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-1,-5,-8,-6,-7};
        System.out.println(findMaxSubArray(arr));
    }

    static int findMaxSubArray(int[] arr){
        int lN = Integer.MIN_VALUE;
        int cs = 0;
        int mx = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if(cs >=0){
                cs += arr[i];
            }else cs = arr[i];
            mx = Math.max(cs,mx);
        }

        return mx;
    }
}
