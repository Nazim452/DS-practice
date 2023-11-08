import java.util.*;
public class stirng {
    public static String firstOcuurane (String str){
        
    
     HashSet<Character> set = new HashSet<Character>();

     for(int i = 0; i<str.length(); i++){
        char curr = str.charAt(i);
         if(set.add(curr)) continue;
    

           return curr+"";
            
        


    }
    return "-1";

}



    public  static ArrayList<String> substring(String s1){
        ArrayList<String> result = new ArrayList<String>();
        int n = s1.length();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<=n; j++){
                result.add(s1.substring(i, j));

            }
        }

        return result;


    }
   
   
    
    public static void main(String[] args) {
        









    //    String str = "phYSiCS by naZIm22";
    //     StringBuilder ans = new StringBuilder(str);

    //     for(int i = 0; i<ans.length(); i++){
    //         char ch = ans.charAt(i);
           
    //        if(ch==' ') continue;
    //        if(ch=='2'||ch=='3') continue;
    //         int ascii = (int)(ch);
            

    //         if(ascii>=97){
    //             ascii-=32;
    //             char dh = (char)(ascii);
    //              ans.setCharAt(i,dh);
    //         }
    //         else {
    //             ascii+=32;
    //             char dh = (char)(ascii);
    //             ans.setCharAt(i,dh);
    //         }
    //     }
    //     System.out.println(ans);
   

    // System.out.println(substring("abc"));




    // TOOGGLE OF CODE WITHOUT STRINGNUILDEr________________________



    // String ans = "nAzIM";
    // for(int i = 0; i<ans.length(); i++){
    //     char ch = ans.charAt(i);
       
    //    if(ch==' ') continue;
    //    if(ch=='2'||ch=='3') continue;
    //     int ascii = (int)(ch);
        

    //     if(ascii>=97){
    //         ascii-=32;
    //         char dh = (char)(ascii);
    //         ans =ans.substring(0, i)+dh+(ans.substring(i+1));
    //     }
    //     else {
    //         ascii+=32;
    //         char dh = (char)(ascii);
    //         ans =ans.substring(0, i)+dh+(ans.substring(i+1));
    //     }
    // }
    // System.out.println(ans);





// reverse each word in array





    // String str = "this is a book";
    // String ans = "";
    // StringBuilder sb = new StringBuilder("");
    // for(int i = 0; i<str.length(); i++){
    //     char curr = str.charAt(i);

    //     if(curr!=' '){
    //         sb.append(curr);
    //     }
    //     else{
    //         sb.reverse();
    //         ans+=sb;
    //         ans+=" ";
    //         sb = new StringBuilder("");

    //     }

    // }
    // sb.reverse();
    // ans+=sb;

    
    // System.out.println(ans);






//  FIRST REPEAED CHARACTER OF STRING____________________________________





          String str = "geeksforgeeks";
          System.out.println(firstOcuurane(str));
   



    }

    
}
