package Backtrack;

// print maxmum no of knight can be placed in given nXn  char 


public class knightTour {
    static int maxKnight = -1;
  

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;

        // 2 UP 1 left

        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;
        i--;
        j--;

        // 2 UP ! right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        i--;
        j++;

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;
        i++;
        j--;

        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        i++;
        j++;

        // 2 Left 1 up

        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;
        i--;
        j--;

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;
        ;
        i++;
        j--;

        // 2 right 1 up

        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        ;
        i--;
        j++;

        /// 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        i++;
        j++;
        return true;
    }

    public static void knight(char[][] board, int row, int col, int num) {
        int n = board.length;
        if (row == n) {
          
            maxKnight = Math.max(maxKnight, num); 
            return;

        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) {
                knight(board, row, col + 1, num + 1);

            } else {
                knight(board, row + 1, 0, num + 1);
            }
            board[row][col] = '.';

        }
        if (col != n - 1)
            knight(board, row, col + 1, num); // not safe
        else
            knight(board, row + 1, 0, num);

    }

    public static void main(String[] args) {

        // creating chess board
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';

            }
        }
       knight(board, 0, 0, 0);
        System.out.println(maxKnight);

    }
}
