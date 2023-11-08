import java.util.*;
public class array{
    static void rearrange(int a[], int n) {
        // code here
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            q1.add(a[i]);
            else
            q2.add(a[i]);
        }
        for(int i=0;i<n;)
        {
            if(!q1.isEmpty())
            {
                a[i]=q1.peek();
                q1.remove();
                i++;
            }
            if(!q2.isEmpty())
            {
                a[i]=q2.peek();
                q2.remove();
                i++;
            }
        }
        
    }

  
    public static void main(String[] args) {
       
  
    }
}