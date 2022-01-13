import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Baitap2 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> tree = new TreeMap<>();
        String test = "Mot hai ba bon nam";
        test = test.toLowerCase(Locale.ROOT);
        for (int i=0; i< test.length();i++) {
            if (tree.containsKey(test.charAt(i))) {
                int count = tree.get(test.charAt(i));
                tree.replace(test.charAt(i),count+1);
            } else {
                tree.put(test.charAt(i),1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = tree.entrySet().iterator();

        System.out.println("Các entry có trong treeMap là: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
