package DSAInJAVA.Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class InBuildHashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        //insert
        hashMap.put("abc",11);
        hashMap.put("def",3);
        hashMap.put("ghi",2);
        if(hashMap.containsKey("abc")){
            System.out.println("HashMap has abc");
        }
        if(hashMap.containsKey("abc1")){
            System.out.println("HashMap has abc1");
        }
        //getValue
        int v = hashMap.get("abc");
        System.out.println("value for abc " + v);
//        int v1 = hashMap.get("abc1"); //null pointer exception
//        System.out.println(v1);
        int v1 = 0;
        if(hashMap.containsKey("abc1")){
            v1 = hashMap.get("abc1");
        }
        System.out.println("value for abc1 " + v1);
        //remove
        hashMap.remove("abc");
        int v2 = 0;
        if(hashMap.containsKey("abc")) {
            v2 = hashMap.get("abc");
        }
        System.out.println("value for abc1 " + v2);
        System.out.println("Size of hashMap " + hashMap.size());
        hashMap.put("def",4);
        System.out.println("Size of hashMap " + hashMap.size());
        //iterate over hashMaps
        Set<String> keys = hashMap.keySet();
        for(String string:keys){
            System.out.print(string + " ");
        }
    }
}
