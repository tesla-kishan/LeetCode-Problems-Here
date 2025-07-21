class Solution {
    private void nqueen(char[][] board, int row,List<List<String>> ans) {
        int n = board.length;
        if(row==n){
            List<String> l = new ArrayList<>();
            //convert 2d char arr to list of string
            for(int i=0 ;i<n ; i++){
                String str = "";
                for(int j=0 ; j<n ; j++){
                    str += board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }
        for(int j=0 ;j<n ;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueen(board,row+1,ans);
                board[row][j]='.';          //backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
          //check row
        for(int j=0 ; j<n ; j++){
            if(board[row][j]=='Q') return false;
        }
        //check col
        for(int i=0 ; i<n ; i++){
            if(board[i][col]=='Q') return false;
        }
        //check north-east
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check south-east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check south-west
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //check north-west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;

    }
    public int totalNQueens(int n) {
      char board[][] = new char [n][n];
        for(int i=0 ;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board,0,ans);
        return ans.size();
    }
}