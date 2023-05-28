package recursion.recursion_Assignment;

import java.util.ArrayList;

public class mazeProblem2 {
    public static void main(String[] args) {

        System.out.println(pathRoute(2,2,""));
    }

    static ArrayList<String> pathRoute(int r, int c, String p){
        if(r==0 && c==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 0){
            list.addAll(pathRoute(r-1,c,p+"D"));
        }
        if(r > 0 && c > 0){
            list.addAll(pathRoute(r-1,c-1,p+"C"));
        }
        if(c > 0){
            list.addAll(pathRoute(r,c-1,p+"R"));
        }
        return list;

    }
}
