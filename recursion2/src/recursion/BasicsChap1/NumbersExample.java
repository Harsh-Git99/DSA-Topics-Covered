package recursion.BasicsChap1;

public class NumbersExample {
    public static void main(String[] args) {
         print(1);
    }

    static  void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        print(n+1);
        System.out.println(n);

    }

}
