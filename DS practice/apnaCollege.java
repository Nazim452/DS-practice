import java.util.*;

public class apnaCollege {



    static void binString(StringBuilder sb, String s){
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        for(int i = 0; i<s.length(); i++){
            char ch   = s.charAt(i);
            boolean checkBInary = false;
           
           

            if((ch=='1'&& i!=0) &&(i!=0&& s.charAt(i-1)=='1')){
               
                checkBInary= true;
            }
            else{
                sb.append(ch);
            }

            if(checkBInary==true){
                System.out.println("Not binary String ");
                return;
            }

        }
        System.out.println("This String is not binary String  --   "+sb);
    }

   

  
    // static int lastOccurnace(int[] arr, int key, int i) {
    //     if (i == arr.length)
    //         return -1;
    //     int ans;

    //     if (arr[i] == key)
    //         ans = arr[i];

    //     return lastOccurnace(arr, key, i + 1);
    // }

    // public static int sub(int[]sum){

    // subarray sum

    // int ans = 0;
    // int maxans = Integer.MIN_VALUE;

    // for(int i = 0; i<sum.length; i++){
    // int st = i;

    // for(int j = i; j<sum.length; j++){
    // int end = j;

    // for(int k = st; k<=end; k++){
    // ans+=sum[k];

    // }
    // // System.out.print(ans+" ");
    // if(ans>maxans) maxans = ans;
    // ans=0;
    // }
    // // System.out.println();
    // }
    // return maxans;

    // }
    public static void main(String[] args) {

        // prime number___________________________________________________________

        // int n = 9;
        // if (n == 2)
        // System.out.println("Number is prime");
        // else {
        // for (int i = 2; i < n/2; i++) {
        // if (n % i == 0) {
        // System.out.println("Number is not prime");
        // return;
        // }
        // }
        // System.out.println("Number is prime");
        // }

        // }

        // subarray sum
        int[] arr = { 2, 2, 3, 32, 2 };
        // System.out.println(lastOccurnace(arr, 3, 0));
        // System.out.println(sum(6));
       binString(new StringBuilder(), "1");
        

    }
}
