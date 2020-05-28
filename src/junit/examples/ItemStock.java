package junit.examples;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    private final Map<String, Integer> list = new HashMap<String, Integer>();

    public void add(String item, int num) {
        int oldSize = size(item);
        int newSize = oldSize + num;
        list.put(item, newSize);
    }

    public int size(String item) {
        Integer size = list.get(item);

        // listに何もなければ、0を返す
        return (size != null) ? size : 0;
    }

    public boolean contains(String item) {

        // listに何もなければ、 0 < 0 でfalseを返す
        return 0 < size(item);
    }
}
