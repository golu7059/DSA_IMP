//   leetcode 1252 : count of cells with odd value

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [] rows = new int [m];
        int [] cols = new int [n];
        for(int[] rc : indices){
            rows[rc[0]]++;
            cols[rc[1]]++;
        }
        int oddRows= 0;
        for(int row : rows){
            if(row % 2 == 1 ){
                oddRows++;
            }
        }
        int oddcols = 0 ;
        for (int col : cols){
            if (col % 2 == 1){
                oddcols++;
            }
        }

        int odds = (oddRows * n) + (oddcols * m);
        int evensFromCrossOver = oddRows * oddcols;
        if(odds > 0 && oddRows > 0 && oddcols > 0 ){
            odds = odds - (2 * evensFromCrossOver);
        }
        return odds;
    }
}