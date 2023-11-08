package Backtrack;
public class nqueen{
    public static boolean nqueen(char[][]board, int r){
        int n = board.length;
        if(n==r){
            count++;
          
            
            return true;
        }

        for(int j =0; j<n; j++) {
            if(isVallid(board, r, j)){
                board[r][j] = 'Q';
                if(nqueen(board, r+1)) return true;
                board[r][j] ='.';
            }
        }
        return false;
    }

    static boolean isVallid(char[][]board, int r,int c){
        for(int i = r-1; i >= 0; i--){
            if(board[i][c]=='Q') return false;
        }
        for(int i = r-1, j = c+1; i>=0&&j<board.length; i--,j++){
            if(board[i][j]=='Q') return false;
        }
        for(int i =r-1, j = c-1; i>=0&&j>=0; i--, j--){
             if(board[i][j]=='Q') return false;

        }
        return true;
    }
    static int count;
    public static void main(String[] args) {
        int n =4;
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                board[i][j] ='.';
            }
        }
       if( nqueen(board, 0)){
        System.out.println("Solution exist");

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;

       }
       else{
        System.out.println("Solution not found");
       }
        System.out.println(count);
        
    }
}