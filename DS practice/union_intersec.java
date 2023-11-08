import java.util.ArrayList;
import java.util.List;

public class union_intersec{

// UNION 

    public static void main(String[] args) {
         int arr1[] ={1,1,1,2,2,3,3,3,3,4,5};
        int[]arr2 = {3,3,3,4,4};
        int l =0 ,r =0;
        int n1 = arr1.length;
        int n2= arr2.length;

        List<Integer> res = new ArrayList<>();





// UNION 




        // while(l<n1|| r<n2){

        //     //skip duplicate

        //     while(l>0   &&l <n1&& arr1[l] ==arr1[l-1])l++;               
            
        //     while(r>0 && r<n2&& arr2[r]==arr2[r-1])r++;
          
        //     // exhaust array
        //     if(l>=n1){
        //         res.add(arr2[r]);
        //         r++;
        //         continue;
        //     }
        //     if(r>=n2){
        //         res.add(arr1[l]);
        //         l++;
        //         continue;
        //     }

        //     // comparison
        //     if(arr1[l]<arr2[r]){
        //         res.add(arr1[l]);
        //         l++;
        //     }
        //     else if(arr1[l]>arr2[r]){
        //         res.add(arr2[r]);
        //         r++;
        //     }
        //     else{
        //         res.add(arr1[l]);
        //         l++;
        //         r++;
        //     }
            
            
        // }
        // System.out.println(res.size());




// Intersection




      while(l<n1  && r<n2){


        // duplicate skip

        while(l>0 && l<n1 &&arr1[l]==arr1[l-1])l++;
        while(r>0 && r<n2 &&arr2[r]==arr2[r-1]) r++;



        //exhaust
        if(l>=n1  || r>=n2){
            break;
        }
            

        // comparison

        if(arr1[l]<arr2[r]) l++;
        else if(arr1[l]>arr2[r]) r++;
        else{
            res.add(arr1[l]);
            l++;
            r++;
        }
        
      }
      System.out.println(res);



    }
}




















