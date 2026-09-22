package HashMap;
import java.util.*;

public class Class {
    public static void main(String[] args) {
        
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 1);
        hm.put("China", 2);
        hm.put("Pakistan", 3);
        hm.put("Nepal", 4);
        hm.put("India",5);

        

        Set<String>keys=hm.keySet();

        System.out.println(keys);
    }
}
