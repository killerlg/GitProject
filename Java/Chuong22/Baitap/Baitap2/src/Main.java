import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomList randomList = new RandomList();
        List<Integer> numbers = randomList.generateList(20,1,10);
        ListFilter listFilter = new ListFilter();
        numbers = listFilter.filterOdd(numbers);
        ListPrinter listPrinter = new ListPrinter();
        listPrinter.printList(numbers);
    }
}
