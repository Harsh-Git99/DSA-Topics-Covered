package recursion.patternQuestions;

public class ques1 {
    public static void main(String[] args) {
        int n =4;
       // printPattern(n);
        print(n,0);

        print2(n,0,0);


    }
    // recursive approach

    static void print (int n , int c){
        if(n == 0){
            return;
        }
        if(n == c){
            System.out.println();
            print(n-1, 0);

        }else {
            System.out.print("* ");
            print(n , c+1);
        }
    }

    static void print2 (int n , int c, int i){
        if(i > n ){
            return;
        }
        if(c == i){
            System.out.println();
            print2(n, 0,i+1);

        }else {
            System.out.print("* ");
            print2(n , c+1, i);
        }
    }

    //iterative approach
    static void printPattern(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
