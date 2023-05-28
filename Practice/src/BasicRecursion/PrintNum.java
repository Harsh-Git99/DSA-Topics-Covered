package BasicRecursion;

public class PrintNum {
    public static void main(String[] args) {

        int n = 10;
        Num(n);
    }

    static void Num(int n){
        if(n==0){
            return;
        }

        Num(n-1);
        System.out.print(n + " ");
    }
}
