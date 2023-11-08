package Backtrack;
// public class kNight {
//      public static boolean isSafe2(char[][]board, int row, int col){
//         int n = board.length;
//         // if(board[row][col]==n*n-1) return true;
//         int i,j;

//         // 2up 1right
//         i = row-2;
//         j = col+1;
//        if(i>=0&& j<n&&board[i][j]=='k')  return false;
       
       

//        //2 up 1 left

//        i = row-2;
//        j = col-1;
//        if(i>=0&&j>=0&&board[i][j]=='k') return false;
       
//        j--;

//        // 2right 1 up

//        i = row-1;
//        j =col+2;
//        if(i>=0&&j<n&&board[i][j]=='k')return false;
       
       


//        // 2right 1 down

//        i = row+1;
//        j = col+2;
//        if(i<n&&j<n&&board[i][j]=='k')return false;
//        i++;
       

//        // 2 left 1 up
//        i = row-1;
//        j =  col-2;
//        if(i>=0&&j>=0&&board[i][j]=='k') return false;
       
//        j--;

//        // 2left 1 down
//        i =row+1;
//        j = col-2;

//        if(i<n&&j>=0&&board[i][j]=='k')return false;
//        i++;
//        j--;

//        // 2down 1 right
//         i = row+2;
//         j = col+1;
//         if(i<n&&j<n&&board[i][j]=='k')return false;
//         i++;
        

//         // 2down 1 left

//         i = row+2;
//         j = col-1;
//         if(i<n&&j>=0&&board[i][j]=='k')return false;
//         i++;
//         j--;

//         return true;
        
//             }


//     public static void helper(char[][]board, int row, int col, int num){
//         int n  = board.length;
//         if(row==n){
//             for(int i = 0; i<n; i++){
//                 for(int j = 0; j<n; j++){
//                     System.out.println(board[i][j]);
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//             return;
//         }

//      else  if(isSafe2(board, row, col)){
//         board[row][col] ='k';
//         if(col!=n-1){
//             helper(board, row, col+1, num+1);
//         }else{
//             helper(board, row+1,0, num+1);
//         }
//         board[row][col]='.';
//       }

//       else{  ///Not safe
//         if(col!=n-1) helper(board, row, col+1, num);
//       else helper(board, row+1,0, num);
      
//       }
//     }
//     public static void main(String[] args) {
//        int n = 4;
//        char[][] board = new  char[n][n];
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//             board[i][j] = '.';
//         }
//        }
//        helper(board, 0, 0, 0);

        
//     }
    
// }






public class kNight{
     static int maxKnight = -1;
    static int number =8;
    public static boolean isSafe(char[][]board, int row, int col){
        int n = board.length;
        int i, j;
        
        // 2 UP 1 left

        i = row-2;
        j = col-1;
        if(i>=0  && j>=0  && board[i][j]=='K') return false;
        i--;
        j--;

        // 2 UP ! right
        i = row-2;
        j = col+1;
        if(i>=0  && j<n  && board[i][j]=='K') return false;
        i--;
        j++;

        //2 down 1 left
        i =row+2;
        j = col-1;
        if(i<n  && j>=0  && board[i][j]=='K') return false;
        i++;
        j--;

        //2 down 1 right
        i = row+2;
        j= col+1;
        if(i<n  && j<n && board[i][j]=='K') return false;
        i++;
        j++;

        // 2 Left 1 up

        i = row-1;
        j = col-2;
        if(i>=0  && j>=0  && board[i][j]=='K') return false;
        i--;
        j--;

        // 2 left 1 down
        i = row+1;
        j = col-2;
        if(i<n  && j>=0  && board[i][j]=='K') return false;;
        i++;
        j--;

        //2 right 1 up

        i = row-1;
        j = col+2;
        if(i>=0  && j<n && board[i][j]=='K') return false;;
        i--;
        j++;

        /// 2 right 1 down
        i = row+1;
        j = col+2;
        if(i<n && j<n && board[i][j]=='K') return false;
        i++;
        j++;
        return true;
    }

    public static  void knight(char[][]board, int row, int col, int num){
        int n = board.length;
        if(row==n){
            if(num==number){   // num- knight==3 par hi sierf caholo
                for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
          
            }
            maxKnight = Math.max(maxKnight,num);
              return;
            
        }
        else if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col!=n-1) {
                knight(board, row, col+1, num+1);
                
            }else{
                knight(board, row+1, 0, num+1);
            }
            board[row][col] = '.';

        }
        if(col!=n-1) knight(board, row, col+1, num);  // not safe
            else knight(board, row+1, 0, num);
       

    }
    public static void main(String[] args) {

        // creating chess board
        int n   = 4;
        char[][] board = new char[n][n];

        for(int i =0;  i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';

            }
        }
        knight(board,0,0,0);
        System.out.println(maxKnight);
        
    }
}
