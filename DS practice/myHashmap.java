import java.util.*;

public class myHashmap {
    public static class myHashMap<k , v>{
        public static  final int DEFAULT_CAPACITY =4;
        public static final float LOAD_FACTOR =0.75f;

        public class Node{
            k key; 
            v value;
            
            Node (k key, v value){
                this.key = key;
                this.value = value;

            }

        }
        private int n;
        private LinkedList<Node> [] bucket;


        private void initBucket(int N){
            bucket = new LinkedList[N];
            for(int i= 0; i<bucket.length; i++){
                bucket[i] = new LinkedList<>();

            }
        }


        private int hashFunction(k key){
            int hc = key.hashCode();
            return (Math.abs(hc))%bucket.length;
        }


        private int search_In_bucket(LinkedList<Node> ll, k key){
            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key==key) return i;
            }
            return -1;
        }


        public myHashMap(){
            initBucket(DEFAULT_CAPACITY);

        }

        public void put(k key, v value){
            int bi = hashFunction(key);
            LinkedList<Node> current_Bucket = bucket[bi];
            int ei = search_In_bucket(current_Bucket, key);

            if(ei==-1){
                Node  node  = new Node(key, value);
                current_Bucket.add(node);
                n++;
            }
            else{
                Node currNode = current_Bucket.get(ei);
                currNode.value = value;
            }

            if(n>=bucket.length*DEFAULT_CAPACITY){
                rehash();
            }



        }


       
        public int size(){
            return n;
        }
        

        public v get(k key){
            int bi = hashFunction(key);
            LinkedList<Node> current_Bucket = bucket[bi];
            int ei = search_In_bucket(current_Bucket, key);

            if(ei!=-1){
                Node currNode = current_Bucket.get(ei);
                return currNode.value;
            }
            return null;
            
        }
    
    
         public v remove(k key){
            int bi = hashFunction(key);
            LinkedList<Node> current_Bucket = bucket[bi];
            int ei = search_In_bucket(current_Bucket, key);

            if(ei!=-1){
                Node currNode = current_Bucket.get(ei);
                v val = currNode.value;
                current_Bucket.remove(ei);
                n--;
                return val;
            }
            return null;
         }


         public void rehash(){
            LinkedList<Node> []old_BUcket = bucket;
            n = 0;
            initBucket(old_BUcket.length*2);
            for(var bucket:old_BUcket){
                for(var node:bucket){
                    put(node.key, node.value);
                }
            }
         }
    
    
    
    }

    public static void main(String[] args) {
        myHashMap nn = new myHashMap<>();
        nn.put("a",1);
        nn.put("b", 2);
        nn.put("c", 3);
        nn.put("d", 4);
        nn.put("e", 5);
        nn.put("f", 6);
       
        System.out.println(nn.size());//3
        System.out.println(nn.get("a"));//1
        System.out.println(nn.get("t"));//Null

       
        System.out.println(nn.size());//6
        System.out.println(nn.get("e"));//5
        nn.remove("f");
        System.out.println(nn.size());//5



        
    }

    








    


// public class hashMap{
//     static class  myHashMap<K , V>{
//         public static final int DEFAULT_CAPACIT = 4;
//         public static final float DEFAILT_LOAD_FACTOR = 0.75F;

//         private class node{
//             K key;
//             V value;

//             node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n ;

//         private LinkedList<node> [] bucket;   // made bucket array

//         // put empty LL in in each bucket

//         private void initBucket(int N){     // N - size of bucket array
//             bucket = new LinkedList[N];

//             for(int i  = 0;i< bucket.length; i++){
//                 bucket[i]  = new LinkedList<>();

//             }

//         }

//         private int hashFun(K key){
//             int hc = key.hashCode();   // give hash value

//             return (Math.abs(hc))% bucket.length;   /// found index of bucket
//         }

//         private int serch_in_bucket(LinkedList<node> ll, K key){
//             for(int i= 0; i<ll.size(); i++){
//                 if(ll.get(i).key == key){
//                     return i;
//                 }

//             }
//             return -1;
//         }



//         // rehashing 


//         private void rehash(){

//             LinkedList<node>[] old_bucket = bucket;
//             n = 0;
//             initBucket(old_bucket.length*2);

//             for(var bucket: old_bucket){    // traverse in old bucket
//                 for(var node:bucket){         // traverse nod eog each bucket
//                     put(node.key, node.value);
//                 }
//             }

//         }

//         // check capacity after rehashing

//         public int capacity(){
//             return bucket.length;
//         }

        
//         // check load factor after rehashing

//         public float loadfactor(){
//             return (n*1.0f) /bucket.length;  // load factor  = thresold value?capcity

//         }



//         public myHashMap(){
//             initBucket(DEFAULT_CAPACIT);
//         }

//         public int size(){
//             return n;
//         }



//         public void put(K key, V value){    // INSERT & UPDATE
//             int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei==-1){    // key not exist

//                 node Node = new node(key, value);
//                 currBucket.add(Node);
//                 n++;
//             }else{    // update case

//                 node currrNode = currBucket.get(ei);
//                 currrNode.value = value;   // update value


//             }


//             // rehashing  
//             if(n>=bucket.length*DEFAILT_LOAD_FACTOR){   // thresold value = capacity * load factor

//                 // if  value greater than thresold value  size double
//                 rehash();
//             }

//         }


//         public V get(K key){
//             int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei!= -1){    // KEY EXIST

//                 node currrNode = currBucket.get(ei);
//                 return  currrNode.value;


//             }
//             // key no 

//             return null;



//         }



//         public V remove(K key){
//              int bi = hashFun(key);
//             LinkedList<node> currBucket = bucket[bi];

//             int ei = serch_in_bucket(currBucket, key);

//             if(ei!=-1){
//                 node currrNode = currBucket.get(ei);
//                 V val = currrNode.value;
//                 currBucket.remove(ei);
//                 n--;
//                 return val;
                
//             }

//             // key not
//         return null;



//         }
//     }
//     public static void main(String[] args) {

//         myHashMap<String ,Integer> mp = new myHashMap<>();
//         mp.put("a", 1);
//         mp.put("b", 2);

//         System.out.println("capcit"+ mp.capacity());   //4
//         System.out.println("Load Factor"+ mp.loadfactor());//<0.75f
//         mp.put("c", 3);
//         mp.put("d",4 );
//         mp.put("e", 5);
        

//         // System.out.println(mp.size());  //3
//         // System.out.println(mp.get("c"));  //3
//         // System.out.println(mp.get("g"));  // 1
//         // System.out.println(mp.remove("a"));  // null


//         // mp.remove("a");
//         // System.out.println(mp.size()); //2
//         System.out.println(mp.get("e")); // 5
        
//         System.out.println("capcit  "+ mp.capacity());  //8
//         System.out.println("Load Factor"+ mp.loadfactor());//<0.75
        
        

//     }
// }











}
