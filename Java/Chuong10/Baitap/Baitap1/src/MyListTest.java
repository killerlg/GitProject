public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("mot");
        list.add("hai");
        list.add("ba");
        list.add("bon");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add("nam",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("mot"));
        System.out.println(clone.contains("hai"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}