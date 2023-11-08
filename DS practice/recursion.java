import java.util.*;

public class recursion {


// return subsequence in arrayList




    static ArrayList<String> ssq(String s) {
        ArrayList<String> ans = new ArrayList<String>();
        if (s.length() == 0){
            ans.add(" ");
            return ans;
        }
            

        char curr = s.charAt(0);
        ArrayList<String> smallans = ssq(s.substring(1));

        for (String ss : smallans) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;

    }



    static void ssq2(String s, String currans){
        if(s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String rem = (s.substring(1));


        ssq2(rem, currans+curr);
        ssq2(rem, currans);
    }
   
   
   

    static void subsetSum(int[]arr, int index, int n, int currSubsetSum){
        if(index>=n){
            System.out.println(currSubsetSum);
            return;
        }
        subsetSum(arr, index+1, n, currSubsetSum+arr[index]);
        subsetSum(arr, index+1, n, currSubsetSum);
    }
   
    public static void main(String[] args) {
        // System.out.println(ssq("abc"));
        // ssq2("abc", "");
        // int[]arr = {2,4,5};
        // subsetSum(arr, 0, arr.length, 0);
       
       

    }
}