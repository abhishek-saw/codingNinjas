package DSAInJAVA.TriesAndHuffmanCoding;

public class TrieUse {
    public static void main(String[] args) {
        Trie dictionary = new Trie();
        System.out.println("----Add----");
        dictionary.add("name");
        dictionary.add("narayana");
        System.out.println("----Search----");
        System.out.println(dictionary.search("name"));
        System.out.println(dictionary.search("naame"));
        System.out.println(dictionary.search("nara"));
        System.out.println(dictionary.search("na"));
        System.out.println("----Remove----");
        System.out.println(dictionary.search("narayana"));
        dictionary.remove("narayana");
        System.out.println(dictionary.search("narayana"));
        dictionary.add("namqe");
        dictionary.add("namwe");
        dictionary.add("namee");
        dictionary.add("naqmxe");
        dictionary.add("namdqe");

        System.out.println(dictionary.countWords());
    }
}
