import java.util.*;
public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("USA",80);
        lhm.put("Russia",50);
        System.out.println(lhm);

        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India",100);
        hm.put("USA",80);
        hm.put("Russia",50);
        System.out.println(hm);
    }
}