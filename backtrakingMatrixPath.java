import java.util.Arrays;

public class backtrakingMatrixPath {
    public static void main(String[] args) {
        boolean [][]board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
       int [][] path = new int[board.length][board[0].length];
        printPath("", board, 0, 0,path,1);
    }

    static void printPath(String p , boolean[][]board,int r , int c , int[][] path, int step){
         if(r == board.length-1 && c == board[0].length-1){
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
         }

         if(!board[r][c]){  // if that place is marked as false then don't execute
            return;
         }
         board[r][c] = false;
         path[r][c] = step;

         if(r<board.length-1) printPath(p+'D', board, r+1, c,path,step+1);
         if(c<board[0].length-1) printPath(p+'R', board, r, c+1,path,step+1);
         if(r>=1) printPath(p+'U', board, r-1, c,path,step+1);
         if(c>=1) printPath(p+'L', board, r, c-1,path,step+1);
         
         board[r][c] = true;
         path[r][c] = 0;
    }
}
