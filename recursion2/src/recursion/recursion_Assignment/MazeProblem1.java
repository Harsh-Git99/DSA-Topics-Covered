package recursion.recursion_Assignment;

import java.util.ArrayList;

public class MazeProblem1 {
    public static void main(String[] args) {

        //System.out.println(numberOfRoute(2,2));

       // System.out.println(routePath(2,2,""));

        System.out.println(routePath2(2,2,""));
    }

    static int numberOfRoute (int r, int c){
        if(r == 0 || c == 0){
            return 1;
        }


        int left =   numberOfRoute(r-1,c);
        int right =  numberOfRoute(r,c-1);

        return left + right;
    }



    static ArrayList<String> routePath(int r, int c, String p){
        if(r == 0 ){
            for (int i = 0; i < c; i++) {
                p = p + "r";
            }
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(c == 0){
            for (int i = 0; i < r; i++) {
                p = p+ "d";
            }
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String > list = new ArrayList<>();

       list.addAll(  routePath(r-1,c,p+"d"));

        list.addAll(routePath(r,c-1,p+"r"));

        return list;
    }


    static ArrayList<String> routePath2(int r, int c, String p){
        if(r == 0 && c == 0){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String > list = new ArrayList<>();
        if(r > 0){
            list.addAll(  routePath(r-1,c,p+"d"));
        }
       if(c > 0){
           list.addAll(routePath(r,c-1,p+"r"));
       }

        return list;
    }


}
