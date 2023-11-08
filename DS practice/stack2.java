import java.util.*;

public class stack2 {



    // _______________________________________LINKED LST IMPLIMENTATION OF QUEUE




    public static class llCircularq{
        int f = -1, r = -1, size = 0;

        int[]arr = new int[4];

        public void push(int val){
            if(f==-1){
                f=r=0;
                arr[0] = val;
                size++;
            }

            else if(r<arr.length-1){
                arr[r+1]  = val;
                r++;
                size++;

            }
            else if(r==arr.length-1){
                r=0;
                arr[0]  =val;
                size++;
            }

         
        }

        int remove(){
            if(size==0) return -1;
            

            else{
                int data = arr[f];
                if(f==arr.length-1){
                    f=0;
                }else{
                    f++;

                }
                size--;
                return data;
            }
            


           
        }
        int peek(){
            if(size==0) return -1;
            return arr[f];
        }

        void display(){
            if(f<=r){
                for(int i =f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for(int i = f; i<arr.length; i++){
                    System.out.print(arr[i]+" ");

                }

                for(int i =0; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }



    public static class llqueue{
        node head = null;
        node tail = null;
        int size = 0;

        void push(int val){
            node temp = new node(val);
            if(size==0){
                head=tail = temp;
                size++;

            }
            else{
                tail.next = temp;
                tail = temp;
                size++;
            }
        }



        int peek() {
            if(head == null) return -1;
            return head.val;
        }



        int pop(){
            if(size == 0) return -1;
            int data = head.val;
            head = head.next;
            size--;
            return data;
        }

        void display(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
            System.out.println();
        }
    }





    public static class node{
        int val;
        node next;

        node(int val){
            this.val = val;
        }
    }

    // public static class llqueue{
    //     node head = null;
    //     node tail = null;
    //     int size = 0;

    //     void push(int val){
    //         node temp = new node(val);
    //         if(size==0){
    //             head=tail = temp;
    //             size++;

    //         }
    //         else{
    //             tail.next = temp;
    //             tail = temp;
    //             size++;
    //         }
    //     }



    //     int peek() {
    //         if(head == null) return -1;
    //         return head.val;
    //     }



    //     int pop(){
    //         if(size == 0) return -1;
    //         int data = head.val;
    //         head = head.next;
    //         size--;
    //         return data;
    //     }

    //     void display(){
    //         node temp = head;
    //         while(temp != null){
    //             System.out.print(temp.val+" ");
    //             temp = temp.next;
    //         }
    //         System.out.println();
    //         System.out.println();
    //     }
    // }



    // ____________________________________ARRAY IMPLIMENTATION OF QUEUE.................





    // public static  class array_impl_of_queue{
    //     int f = -1;
    //     int r = -1, size = 0;
    //     int[]arr = new int[100];

    //     public void add(int val){
    //         if(r==arr.length-1) return;

    //         if(f==-1){
    //             f=r=0;
    //             arr[0] = val;
    //             size++;
    //         }
    //         else{
    //             arr[r+1] = val;
    //             r++;
    //             size++;
    //         }
    //     }

    //     int pop(){
    //         if(size==0) return -1;
    //         f++;
    //         size--;
    //         return arr[f-1 ];
    //     }

    //     int peek(){
    //         if(size==0) return -1;
    //         return arr[f];
    //     }

    //     void display(){
    //         if(size==0) return;

    //         for(int i = f; i<=r; i++){
    //             System.out.print(arr[i]+" ");
    //         }
    //         System.out.println();

    //     }

    // }
    public static void main(String[] args) {
     


        // INFIX EXPRESSION





       // String str = "9-(5+3)*4/6";

        // Stack<Integer> st = new Stack<Integer>();
        // Stack<Character> opr = new Stack<Character>();

        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);

        //     int ascii = (int)(ch);

        //     if(ascii>=48&&ascii<=57) st.push(ascii-48);

        //     else if(opr.size()==0|| ch=='('|| opr.peek()=='(') opr.push(ch);

        //     else if(ch==')'){
        //         while(opr.peek()!='('){
        //             int val2 = st.pop();
        //             int val1 = st.pop();

        //             if(opr.peek()=='-') st.push(val1-val2);
        //             if(opr.peek()=='+') st.push(val1+val2);
        //             if(opr.peek()=='*') st.push(val1*val2);
        //             if(opr.peek()=='/') st.push(val1/val2);

        //            opr.pop();
                   

        //         }
        //         opr.pop();
        //     }

        //     else{
        //         if(ch=='+'||ch=='-'){
        //             int val2 = st.pop();
        //             int val1 = st.pop();
        //             if(opr.peek()=='-') st.push(val1-val2);
        //             if(opr.peek()=='+') st.push(val1+val2);
        //             if(opr.peek()=='*') st.push(val1*val2);
        //             if(opr.peek()=='/') st.push(val1/val2);

        //            opr.pop();
        //            opr.push(ch);
                   
                   
        //         }


        //         if(ch=='*'||ch=='/'){

        //             if(opr.peek()=='*'|| opr.peek()=='/'){

        //               int val2 = st.pop();
        //               int val1 = st.pop();

        //              if(opr.peek()=='*') st.push(val1*val2);
        //               if(opr.peek()=='/') st.push(val1/val2);

        //              opr.pop();
        //              opr.push(ch);
        //           }
        //           else opr.push(ch);
                   
                    

                   

        //         }
        //     }

                
            
        // }
         

        // while(st.size()>1){
            
        //             int val2 = st.pop();
        //             int val1 = st.pop();

        //             if(opr.peek()=='-') st.push(val1-val2);
        //             if(opr.peek()=='+') st.push(val1+val2);
        //             if(opr.peek()=='*') st.push(val1*val2);
        //             if(opr.peek()=='/') st.push(val1/val2);

        //            opr.pop();

        // }
        // System.out.println(st.peek());



        


        /////////////////////////INFIX TO prefix





        //  String str = "9-(5+3)*4/6";
        //  Stack<String> val= new Stack<>();
        //  Stack<Character> op = new Stack<>();

        //  for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     int ascii = (int)(ch);

        //     if(ascii>=48&&ascii<=57){
        //         String s = ch+"";
        //         val.push(s);
        //     }

        //     else if(op.size()==0||ch=='('|| op.peek()=='(') op.push(ch);

        //     else if(ch==')'){
        //         while(op.peek()!='('){
        //             String v2 =val.pop();
        //             String v1 =val.pop();
        //             char  o = op.pop();
        //             String t = o+v1+v2;
        //             val.push(t);
                    

        //         }
        //         op.pop();
        //     }

        //     else{
        //         if(ch=='+'|| ch=='-'){
        //             String v2 =val.pop();
        //             String v1 =val.pop();
        //             char  o = op.pop();
        //             String t = o+v1+v2;
        //             val.push(t);
        //             op.push(ch);
                    

        //         }

        //         if(ch=='*'||ch=='/'){
        //             if(op.peek()=='*'||op.peek()=='/'){
        //                 String v2 =val.pop();
        //                 String v1 =val.pop();
        //                 char  o = op.pop();
        //                 String t = o+v1+v2;
        //                 val.push(t);
        //                 op.push(ch);
    
        //             }
        //             else op.push(ch);
        //         }
        //     }
        //  }

        //  while(val.size()>1){

        //     String v2 =val.pop();
        //     String v1 =val.pop();
        //     char  o = op.pop();
        //     String t = o+v1+v2;
        //     val.push(t);
            

        //  }

        //  System.out.println(val.peek());





        

        //____________________________________________postfix evaluation




        // String str ="953+4*6/-";
        // Stack<Integer> val = new Stack<Integer>();

        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);

        //     int ascii = (int)(ch);
            
        //     if(ascii>=48&& ascii<=57) val.push(ascii-48);

        //     else{
        //         int v2 = val.pop();
        //         int v1 = val.pop();
        //         if(ch=='+')val.push(v1+v2);
        //         if(ch=='-') val.push(v1-v2); 
        //         if(ch=='*') val.push(v1*v2); 
        //         if(ch=='/') val.push(v1/v2); 

               
               
               

        //     }
        // }
        // System.out.println(val.peek());




        // ___________________________________ARRAY IMPLIMENTATION OF QUEUE







    }
  
}
