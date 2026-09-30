import java.util.*;

public class JavaCollection3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        
        //insertion -> put()
        map.put("in","India");
        map.put("en","England");
        map.put("us", "United States");

        System.out.println(map);

        Map<String,String> m = new HashMap<>();
        m.put("deu", "Germany");

        System.out.println("Before: " + m);
        m.putAll(map);
        System.out.println("After: " + m);

        //deletion
        m.remove("en");
        System.out.println(m);

        //size
        System.out.println(m.size());

        //clear
        //m.clear();

        //putIfAbsent(K,V) : Insert the association if the key K is not already associated with the value V.

        m.putIfAbsent("en","England");
        m.get("in");

        m.containsKey("deu");
        m.containsValue("Spain");

        m.replace("in", "Indonesia");
        System.out.println(m);

        System.out.println("Key Set: " + m.keySet());
        System.out.println("Values: " + m.values());
        System.out.println("Printing Entries: " + m.entrySet());

        //Iterating over a Map
        for(Map.Entry<String,String> entry : m.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
