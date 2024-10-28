import java.util.*;
public class Hashmap {
   public static void main(String[] var0) {
      HashMap <String,Integer>hm = new HashMap<>();
      hm.put("coffe", 15);
      hm.put("tea", 15);
      System.out.println(hm);

      int price=hm.get("coffe");
      System.out.println(price);

      System.out.println(hm.get("coffe"));

      System.out.println(hm.containsKey("coffe"));
      System.out.println(hm.containsKey("tea"));

      System.out.println(hm.remove("tea"));
      System.out.println(hm.size());
        
    Set<String> keys = hm.keySet();
    System.out.println(keys);
    
    for(String k : keys){
      System.out.println("key:"+k+ ",value: "+hm.get(k));
    }

   }
}


