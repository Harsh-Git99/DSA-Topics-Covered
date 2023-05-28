package BinarySrc;

public class smallestLetterGretrThnTrgt {
    public static void main(String[] args) {
        char[] letr = {'c','f','j'};
        char target = 'a';

       char ans = smallestLetter(letr,target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] letr, char target){

        int start = 0;
        int end = letr.length-1;

        while (start <= end){

            int mid = start + (end-start)/2;

            if ( target > letr[mid] ){
                start = mid+1;
            } else if (target < letr[mid]) {
                end = mid -1;
            }

        }
    return letr[start % letr.length];
    }
}
