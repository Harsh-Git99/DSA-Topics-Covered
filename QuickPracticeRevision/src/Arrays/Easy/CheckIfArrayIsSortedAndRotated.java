package Arrays.Easy;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {6, 7, 7, 5};

        System.out.println(sorted(arr));

    }


    static boolean sorted(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}