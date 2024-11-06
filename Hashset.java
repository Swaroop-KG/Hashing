import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("contains");
        }else{
            System.out.println("not contains");
        }
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        for(Integer number :set){
            System.out.println(number);
        }
    }
}
