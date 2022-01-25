import com.codegym.CollectionUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionOperations co = new CollectionUtilsAdapter();
        Client client = new Client(co);
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Set<Integer> targetSet = new HashSet<>(sourceList);
        client.printMaxValue(targetSet);
    }
}
