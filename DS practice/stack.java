import java.util.*;

public class stack {

    // linked list implementation in stack



    // public static class node { // user definded data type
    //     int val;
    //     node next;

    //     node(int val) {
    //         this.val = val;
    //     }

    // }

    // public static class llStack {
    //     node head = null;
    //     int size = 0;

    //     public void push(int val) {
    //         node temp = new node(val);
    //         temp.next = head;
    //         head = temp;
    //         size++;
    //     }

    //     public int pop() {
    //         int curr = head.val;
    //         head = head.next;
    //         size--;
    //         return curr;
    //     }

    //     public void display() {
    //         node temp = head;
    //         while (temp != null) {
    //             System.out.print(temp.val + " ");
    //             temp = temp.next;
    //         }
    //         System.out.println();

    //     }

    //     int size() {
    //         return size;
    //     }

    //     int peek() {
    //         return head.val;
    //     }

    // }



    public static void main(String[] args) {

        String str = "9-(5+3)*4/6";

        Stack<Integer> st = new Stack<Integer>();
        Stack<Character> opr = new Stack<Character>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            int ascii = (int)(ch);

            if(ascii>=48&&ascii<=57) st.push(ascii-48);

            else if(opr.size()==0|| ch=='('|| opr.peek()=='(') opr.push(ch);

            else if(ch==')'){
                while(opr.peek()!='('){
                    int val2 = st.pop();
                    int val1 = st.pop();

                    if(opr.peek()=='-') st.push(val1-val2);
                    if(opr.peek()=='+') st.push(val1+val2);
                    if(opr.peek()=='*') st.push(val1*val2);
                    if(opr.peek()=='/') st.push(val1/val2);

                   opr.pop();
                   

                }
                opr.pop();
            }

            else{
                if(ch=='+'||ch=='-'){
                    int val2 = st.pop();
                    int val1 = st.pop();
 if(opr.peek()=='-') st.push(val1-val2);
                    if(opr.peek()=='+') st.push(val1+val2);
                    if(opr.peek()=='*') st.push(val1*val2);
                    if(opr.peek()=='/') st.push(val1/val2);

                   opr.pop();
                   opr.push(ch);
                   
                   
                }


                if(ch=='*'||ch=='/'){

                    if(opr.peek()=='*'|| opr.peek()=='/'){

                     int val2 = st.pop();
                    int val1 = st.pop();

                  if(opr.peek()=='*') st.push(val1*val2);
                    if(opr.peek()=='/') st.push(val1/val2);

                    opr.pop();
                     opr.push(ch);
                  }
                  else opr.push(ch);
                   
                    

                   

                }
            }

                
            
        }
         

        while(st.size()>1){
            
                    int val2 = opr.pop();
                    int val1 = opr.pop();

                    if(opr.peek()=='-') st.push(val1-val2);
                    if(opr.peek()=='+') st.push(val1+val2);
                    if(opr.peek()=='*') st.push(val1*val2);
                    if(opr.peek()=='/') st.push(val1/val2);

                   opr.pop();

        }
        System.out.println(st.peek());





    }




}
