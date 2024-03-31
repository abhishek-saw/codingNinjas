package DSAInJAVA.Hashmaps;

import java.util.ArrayList;

public class Map<K,V> {
    //     ArrayList of nodes containing nodes of key value and next position
    ArrayList<MapNode<K,V>> buckets;
    int count ; // size of map
    int numBuckets; // to fix the size to 20
    //     constructor
    public Map(){
        buckets = new ArrayList<>();
        numBuckets = 20;
        for (int i=0;i<numBuckets;i++){ // filling all with null
            buckets.add(null);
        }
    }
    public int size(){
        return count;
    }
    private int getBucketIndex(K key){
        // Hash Function
        // in built function depends on what is the type of the key
        // it will pick the function or else use the object class
        // hash code, or you can also implement your own hashcode using separate chaining
        int hc = key.hashCode(); //hashcode
        int index = hc%numBuckets; //compression
        return index;
    }
    public void insert(K key,V value){
        int bucketIndex = getBucketIndex(key); // to get the index using hashcode and compression
        MapNode<K,V> head = buckets.get(bucketIndex); // to find the head stored at the index
        while(head!=null){ // if the key is already present then we will just update its value
            if(head.key.equals(key)) { // checking its present of not
                head.value = value;
            }
            head = head.next;
        }
        // if element not present then, insert at 0th position of the Linked list
        // it will point to the head of that index
        head = buckets.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<>(key, value); // creating a new node
        newNode.next = head; // storing the prev in next of newNode
        buckets.set(bucketIndex, newNode); // now making the newNode as the head of that index
        count++;
//        Rehashing Step
        double loadFactor = (1.0*count)/numBuckets;
        if(loadFactor>=0.7){
            rehash();
        }
    }
    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head!=null){
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if(prev!=null) {
                    prev.next = head.next;
                }
                else {
                    buckets.set(bucketIndex,head.next);
                    count--;
                    return head.value;
                }
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
    public boolean search(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    private void rehash() {
        //    TIME COMPLEXITY
//    insert-> WORST : O(N) AVERAGE : O(n/b)
//    1. Calculating hashcode -> O(l) => length of String {Average of string.length is 5<<<<<10^5} hence we will ignore this
//    2. Traversing on Linked List -> 0(N) if all are on same but
//    Average load on one bucket is n/b => load factor
//    n/b<0.7 =>Ensure bucket not contains many entries
//      n = number of entries in the map;
//      b = number of buckets
//    if n = 100 then b = 120-130
//    if load factor > 0.7 <=>  Do rehashing
        System.out.println("Rehashing: buckets " + buckets.size()+ " size " + count);
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0;i<numBuckets*2;i++){
            buckets.add(null);
        }
        count = 0;
        numBuckets = numBuckets*2;
        for (int i =0;i<temp.size();i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }
    public double loadFactor() {
        return (1.0*count)/numBuckets;
    }

}
