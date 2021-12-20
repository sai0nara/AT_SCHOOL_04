import somethinggreen.Contract;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Object> map = new HashMap<>();
map.put("key1", "value");
map.put("key2", "value");
map.put("key3", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");
map.put("key4", "value");


        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
        Contract.staticMethod("");

        System.out.println(map);
    }
}
