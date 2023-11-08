package Backtrack;


public class nqueen2 {
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // for( int i =row-1, j = col-1;i>=0&&j>=0; i--, j--){
        // if(board[i][j]=='Q') return false;

        // }
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;

        }
        // for(int i = row-1, j = col+1;i>=0&&j<board.length; i--,j++){
        // if(board[i][j]=='Q') return false;
        // }
        i = row - 1;
        j = col+ 1;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;

        }

        return true;

    }

    public static void nqueen(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            System.out.println("------- chessBoard-----------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);

                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = '.';
            }
        }

    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';

            }
        }
        nqueen(board, 0);

    }


}

































