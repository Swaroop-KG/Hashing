import java.util.*;

public class TreeHashMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("USA", 80);
        tm.put("Russia", 50);
        System.out.println(tm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 80);
        hm.put("Russia", 50);
        System.out.println(hm);
    }
}
