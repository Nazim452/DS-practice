package Backtrack;
// public class ratInaMAZE  {
//     public static void print(int sr,int sc,int er,int ec,String s, boolean[][]isVisited){
        
//         if(sr>er|| sc>ec||sr<0||sc<0) return;
//         if(isVisited[sr][sc]==true)return;
//         if(sr==er&&sc==ec){
//             System.out.println(s);
//             return;
//         }

//         // if(isVisited[sr][sc]==true)return;

//         isVisited[sr][sc] = true;
//         //right
//         print(sr, sc+1, er, ec, s+"R", isVisited);
//         //down
//         print(sr+1, sc, er, ec, s+"D", isVisited);
//         //left
//         print(sr, sc-1, er, ec, s+"L", isVisited);
//         //up
//         print(sr-1, sc, er, ec, s+"U", isVisited);

//         isVisited[sr][sc] = false;
//     }
//     public static void main(String[] args) {
//         int row = 3, col = 3;
//         boolean[][]isVisited = new boolean[row][col];
//         print(0, 0, row-1, col-1, " ", isVisited);
        

//     }
    
// }




//counting path


// public class ratInaMAZE  {
//     public static int print(int sr,int sc,int er,int ec,boolean[][]isVisited){
        
//         if(sr>er|| sc>ec||sr<0||sc<0) return 0;
//         if(isVisited[sr][sc]==true)return 0;
//         if(sr==er&&sc==ec) return 1;

//         // if(isVisited[sr][sc]==true)return;

//         isVisited[sr][sc] = true;
//         //right
//         int r =print(sr, sc+1, er, ec, isVisited);
//         //down
//         int d =print(sr+1, sc, er, ec, isVisited);
//         //left
//         int l=print(sr, sc-1, er, ec, isVisited);
//         //up
//         int u =print(sr-1, sc, er, ec, isVisited);

//         isVisited[sr][sc] = false;

//         return r+d+l+u;
//     }
//     public static void main(String[] args) {
//         int row = 3, col = 3;
//         boolean[][]isVisited = new boolean[row][col];
//         System.out.println(  print(0, 0, row-1, col-1, isVisited));
        

//     }
    
// }







// o th path blocked other path we can go

public class ratInaMAZE{
    public static void print(int sr, int sc, int er, int ec, String s, int[][]maze){
        if(sr<0||sc<0||sr>er||sc>ec)return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;

        maze[sr][sc] = -1;
        //right
        print(sr, sc+1, er, ec, s+"R", maze);
        //down
        print(sr+1, sc, er, ec, s+"D", maze);
        //left
        print(sr, sc-1, er, ec, s+"L", maze);
        //up
        print(sr-1, sc, er, ec, s+"U", maze);

        maze[sr][sc] = 1;
    }
    
    public static void main(String[] args) {
        int r = 3, c= 4;
        int[][]maze ={
                      {1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}
                                };


      print(0, 0, r-1, c-1, " ", maze);

                          
    }
}

















