package _22_Sets_And_Maps;

import java.util.HashMap;

public class _06_MapsCollectionFramework {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Malik",67); map.put("Afsharul",28);
        map.put("Shree",7); map.put("Abhishek",128);
        // traversing
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
//        System.out.println(map+" "+map.size());
//        System.out.println(map.remove("Abhishek"));
//        System.out.println(map+" "+map.size());
//        map.put("Harsh",51);
//        System.out.println(map+" "+map.size());
    }
}
