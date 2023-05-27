package Arrays_Revision;

public class MaxCount {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};

        System.out.println(countOnes(arr));
    }

    static  int countOnes (int[] arr){
        int count = 0, max = 0;

        for (int ele : arr){
            if(ele == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }else count=0;
        }
        return max;
    }
}
