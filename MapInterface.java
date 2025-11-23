import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Harshit");
        map.put(2,"Amit");
        map.put(3,"Shubham");
        map.put(4,"Bhavya");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
        System.out.println(map.get(1));
        System.out.println(map.containsValue("Harshit"));
        System.out.println(map.put(5,"Harsha"));
        System.out.println(!map.isEmpty());
        System.out.println(map.getOrDefault(5,"Mansi"));
        map.forEach((key, value) ->{
            System.out.println(key +" : "+value);
        });
        Set<Integer> integers = map.keySet();
        ArrayList<String> values = new ArrayList<>(map.values());
        System.out.println(values);
        map.putAll(new HashMap<>(
                Map.of(7,"Harshit")
        ));
        map.forEach((K,V) ->{
            System.out.println(K+ " : "+V);
        });
    }
}
