package Functions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        isArm(num);

        for (int i = 0 ; i<=1000;i++){
            if (isArm(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isArm(int n){

        int sum = 0;
        int temp = n;
        while (n>0){
            int rem = n %10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        if (sum == temp)
            return true;
        else{
        return false;
        }
    }
}












































//
//
//
//
//
//
//
//
//
//
//
//
//

// System.out.print("Enter the number :");
//       // int num = in.nextInt();
//
//
//        for (int i =0 ; i<=1000;i++){
//
//            if (isArms(i)){
//                System.out.println(i);
//            }
//
//        }
//      //  isArms(num, sum);
//
//
//
//    }
//
//    static void isArms(int n){
//        int sum =0;
//        int temp = n;
//        while (n >0){
//            int rem = n %10;
//            n = n/10;
//            sum = sum + rem*rem*rem;
//        }
//        System.out.println(sum);
//
//        if (sum == temp){
//            System.out.println("This number is an Armstrong num");
//        }
//        else
//            System.out.println("the num is not an Armstrong num");
//
//
//    }

