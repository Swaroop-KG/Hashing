import java.util.*;
public class UnionandIntersection {
    public static void main(String[] args) {
        int arr1[] = {4,6,8};
        int arr2[] = {2,3,4,1,5,6,8,3,4,8};
    HashSet<Integer> set = new HashSet<>();
     
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
 
    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);

    }

    System.out.println("Union="+set.size()+set);

    set.clear();
//Intersection
for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
 int count =0;
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
            count++;
             set.remove(arr2[i]);
        }
    }
System.out.println("Intersection = "+count);
}
}