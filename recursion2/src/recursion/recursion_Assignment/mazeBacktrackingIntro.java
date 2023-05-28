package recursion.recursion_Assignment;

public class mazeBacktrackingIntro {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        obstaclePath(0,0,maze,"");
    }

    static void obstaclePath(int r, int c, boolean[][] maze, String P ){
        if(r==maze.length-1 && c == maze[0].length-1){

            System.out.println(P);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            obstaclePath(r+1,c,maze,P+"D");
        }
        if(r > 0){
            obstaclePath(r-1,c,maze,P+"U");
        }
        if(c < maze[0].length-1){
            obstaclePath(r,c+1,maze,P+"R");
        }
        if(c > 0){
            obstaclePath(r,c-1,maze,P+"L");
        }
        maze[r][c] = true;
    }
}
