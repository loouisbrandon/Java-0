import java.util.HashMap;

public class HashMapDemo {
    

    public static void main(String[] args) {
        
            HashMap<String, Integer> map = new HashMap<>();

            map.put("a", 10);
            map.put("b", 20);
            map.put("c", 30);

            System.out.println("Size of map is:- " + map.size());
            System.out.println(map);

            if (map.containsKey("a")){
                Integer a = map.get("a");
                System.out.println("value for key" + "\"a\" is:-" + a);
            }

            for (String key : map.keySet()) {
                System.out.println("Key: "+ key+", value: " + map.get(key));
            }
    }
}
