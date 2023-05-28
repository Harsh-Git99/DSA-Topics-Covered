package Functions;

import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        //When an obj's ref is passed in the function the ref itself is passed by CALL BY VALUE
        //because the value that has been passed refers to obj
        change (arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change (int[] nums){
        nums[0]=99;     //If you make a change in the object via this ref variable, the original variable value will also get changed
    }
}
