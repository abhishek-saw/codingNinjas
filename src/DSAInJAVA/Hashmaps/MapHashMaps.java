package DSAInJAVA.Hashmaps;


public class MapHashMaps {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new Map<>();
        hashMap.insert("abc",11);
        hashMap.insert("def",3);
        hashMap.insert("ghi",2);
        hashMap.insert("mno",7);

        if(hashMap.search("abc")){
            System.out.println("HashMap has abc");
            int v = hashMap.getValue("abc");
            System.out.println("value for abc " + v);
        }
        if(hashMap.search("abc1")){
            System.out.println("HashMap has abc1");
            int v1 = hashMap.getValue("abc1");
            System.out.println("value for abc1 " + v1);

        }
        else {
            System.out.println("HashMap has not abc1");
            System.out.println("value for abc1 " + 0);
        }
        hashMap.removeKey("abc");
        int v2 = 0;
        if(hashMap.search("abc")) {
            v2 = hashMap.getValue("abc");
        }
        System.out.println("value for abc " + v2);
        System.out.println("Size of hashMap " + hashMap.count);
        hashMap.insert("def",4);
        System.out.println("Size of hashMap " + hashMap.count);
//        iterate over hashMaps
//        Set<String> keys = hashMap.keySet();
//        for(String string:keys){
//            System.out.print(string + " ");
//        }
        Map<String,Integer> integerMap = new Map<>();
        for (int i=0;i<40;i++){
            integerMap.insert("abc"+i,i+1);
            System.out.println(integerMap.loadFactor());
        }
    }
}
