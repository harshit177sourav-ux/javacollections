import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Harshit");
        map.put(2,"Amit");
        map.put(3,"Shubham");
        map.put(4,"Bhavya");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }
}
