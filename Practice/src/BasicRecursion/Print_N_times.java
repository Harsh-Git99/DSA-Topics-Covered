package BasicRecursion;

public class Print_N_times {
    public static void main(String[] args) {
        int num = 5;
        print(num);
    }

    static void print(int num){
        if(num==0){
            return;
        }
        System.out.print("gfg ");
        print(num-1);


    }
}
