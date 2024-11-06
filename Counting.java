import java.util.*;
public class Counting {
    public static void main(String[] args) {
        int arr[] = {2,4,3,1,6,5,7,4,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("ans="+set.size());
    }
}
