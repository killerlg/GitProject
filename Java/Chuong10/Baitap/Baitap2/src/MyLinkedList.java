public class MyLinkedList {
    private Node head;
    private int numNode;
    private boolean flag;



    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }

        holder = temp.getNext();
        temp.setNext(new Node(data));
        temp.getNext().setNext(holder);
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.setNext(temp);
        numNode++;
    }

    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(new Node(data));
        }
    }

    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp.setNext(temp.getNext().getNext());
        }

        numNode--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.getNext();
        System.out.println(temp.getData());
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.getNext();
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.getData()).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                temp = temp.getNext();
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.getData()).equals(data)) {
                q = i;
                break;
            }
            else {
                temp = temp.getNext();
            }
        }
        return q;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}