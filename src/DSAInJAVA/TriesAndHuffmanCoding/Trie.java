package DSAInJAVA.TriesAndHuffmanCoding;

public class Trie {
    private final TrieNode root;
    public Trie(){
        root = new TrieNode('\0'); // this is kinda of root which have the next 26 element
    }
    public void add(String word) {
        addHelper(root, word);
        root.childCount++;
    }
    private void addHelper(TrieNode root, String word){
        if(word.isEmpty()) {
            root.isTerminal = true;
            root.childCount--;
            return;
        }
        int childIndex = word.charAt(0)- 'a'; // 'd' - 'a' = location of a in 0,1,2,3,....
        TrieNode child = root.children[childIndex]; // to find that if anything already present there or not;
        if(child==null) { // if it's not present we have to add that in that particular root at that position
            child = new TrieNode(word.charAt(0)); //creating the child index for the word
            root.children[childIndex] = child;//adding that the child index we have calculated above
        }
        addHelper(child, word.substring(1)); // then we go more down to add the next char for the word string
    }
    public boolean search(String word){
        return searchHelper(root,word);
    }
    private boolean searchHelper(TrieNode root, String word) {
        if(word.isEmpty()){
            return root.isTerminal;
        }
        int childIndex = word.charAt(0)- 'a';
        TrieNode child = root.children[childIndex];
        if(child!=null){
            return searchHelper(child,word.substring(1));
        }
        else{
            return false;
        }
    }
    public void remove(String word) {
        removeHelper(root,word);
    }
    private void removeHelper(TrieNode root, String word) {
        if (word.isEmpty()) {
            if(root.isTerminal) {
                root.isTerminal = false;
                return;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return;
        }
        removeHelper(child, word.substring(1));
        if(!child.isTerminal && child.childCount==0){
            root.children[childIndex] = null;
            root.childCount--;
        }
//        OR
//        if(!child.isTerminal){
//            for (int i=0;i<25;i++){
//                if(child.children[i]!=null){
//                    return;
//                }
//                else {
//                    root.children[i] = null;
//                }
//            }
//        }
    }
    public  int countWords(){
        return root.childCount;
    }
//    My version of without child Count
//    public int countWords() {
//        return countWordsHelper(root);
//    }
//    private int countWordsHelper(TrieNode root) {
//        if(root==null){
//            return 0;
//        }
//        int totalCount = 0;
//        if(root.isTerminal) {
//             totalCount = 1;
//        }
//        for(int i =0; i<26;i++){
//            int smallSum = countWordsHelper(root.children[i]);
//            totalCount+=smallSum;
//        }
//        return totalCount;
//    }
}
 