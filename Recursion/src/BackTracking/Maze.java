package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        //System.out.println(count(3,3));

//        path("",3,3);
//
//        System.out.println(pathList("",3,3));

      //  pathDiagonal("",3,3);

      //  pathWithRestrictions("",3,3);

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},

        };

        pathWithRestrictionsBool("", maze,0,0);
    }

    static int count (int row, int col){
        if(row==1 || col ==1){
            return 1;
        }

        int down = count(row-1, col);
        int right = count(row, col-1);

        return down+right;
    }


    static void path (String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row >1){
            path(p + "R", row-1,col);
        }
        if(col >1){
            path(p + "D", row,col-1);
        }
    }


    static ArrayList<String> pathList (String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();         //this ref variable "list" is different refVariable from list in line 43, but pointing to the same object.

        if(row >1){
            list.addAll( pathList(p + "R", row-1,col));
        }
        if(col >1){
            list.addAll(  pathList(p + "D", row,col-1));
        }
        return list;
    }

    static void pathDiagonal (String p, int row, int col){
        if(row == 1 && col == 1 ){
            System.out.println(p);
            return;
        }
        if(row >1){
            pathDiagonal(p + " -> Right", row-1,col);
        }
        if(col >1){
            pathDiagonal(p + " -> Down", row,col-1);
        }
        if(row>1&&col>1){
            pathDiagonal(p + " -> diagonal", row-1,col-1);
        }

    }

    static  void  pathWithRestrictions (String p, int row,int col){
        if(row==1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row == 2 && col ==2){
            return ;
        }
        if(row>1){
            pathWithRestrictions(p + "R",row-1,col);
        }
        if(col>1){
            pathWithRestrictions(p + "D",row,col-1);
        }

    }

    static void pathWithRestrictionsBool (String p, boolean[][] maze, int row,int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }

        if(row<maze.length-1){
            pathWithRestrictionsBool(p + "R",maze,row+1,col);
        }

        if(col<maze[0].length-1){
            pathWithRestrictionsBool(p + "D",maze,row,col+1);
        }
    }
}

