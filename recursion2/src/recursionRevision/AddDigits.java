package recursionRevision;

public class AddDigits {
    public static void main(String[] args) {
        int num = 0;

        System.out.println(getLeast(num));
    }

    static int getLeast(int num){
        if(num/10 == 0){
            return num;
        }

        int sum = 0;

        while(num != 0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        return getLeast(sum);



    }
}
