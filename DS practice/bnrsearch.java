public class bnrsearch {
    static int frirstOccurance(int[]arr, int x){
        int ans = 0;
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==x){
                ans = mid;
                end = mid-1;
            }
            else if(x<arr[mid]){
                end = mid-1;
           
            }else{
                st = mid+1;
                
            }
        }


        return ans;
    }
    
    // find minimum  in  rotated array

    static int searching(int[]arr){
        int n = arr.length;
        int ans=-1;
        int st = 0, end = n-1 ;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]>arr[n-1]){
                st = mid+1;
            }
           else{
            ans = mid;
            end = mid-1;
           }
           
        }




        return ans;
    }



    static int searchINRotatedArray(int[]arr, int tar){

        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==tar) return mid;
            else if(arr[st]==arr[mid]&&arr[mid]==arr[end]){
                st++;
                end--;
            }

            else if(arr[mid]<=arr[end]){
                if(tar>arr[mid]&&tar<=arr[end]) st = mid+1;
                else end = mid-1;
            }
            else{     // st to mid sorted

                if(arr[st]<=tar&&arr[mid]>tar) end = mid-1;
                else st= mid+1;

            }

           
        }

        return -1;
    }

    
  
    
    public static void main(String[] args) {
        // int[]arr = {1,3,3,4,4,4,5,5,6,6,7};
        // System.out.println(frirstOccurance(arr, 3));

        // int[]arr = {3,4,5,1,2};
        // System.out.println(searching(arr));

        int[]arr = {1,1,1,1,1,2,3,3,3,4,4,1,1,1,1};
        System.out.println(searchINRotatedArray(arr, 3));
       

        
    }
    
}
