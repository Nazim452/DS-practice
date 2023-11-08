package Backtrack;

public class knightTour2 {
   

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



    static void knightTour(char[][] board, int r, int c, int num){
        if(board.length==r){
            if(num==number){
                for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
           
            }
             return;
        }
      else  if(isSafe(board, r, c)){
            board[r][c] ='K';
            if(c!=board.length-1) knightTour(board, r, c+1, num+1);
            else knightTour(board, r+1, 0, num+1);
            board[r][c] ='.';
        }
        
   
         if(c!=board.length-1) knightTour(board, r, c+1, num);
        else knightTour(board, r+1, 0, num);
       

        
    }
    static int maxKnight=-1;
    static int number = 5;
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] ='.';
            }
        }
        knightTour(board, 0, 0, 0);
        
    }
}
