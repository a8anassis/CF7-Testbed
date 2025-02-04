package gr.aueb.cf.ch19.doubly_linked_list;

public class DoublyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    /**
     * Time complexity O(1)
     * @param t the value to be inserted
     */
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Time-complexity O(1)
     * @param t
     */
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

    /**
     * Time-complexity O(1)
     * @return  the removed node.
     */
    public Node<T> removeFirst() {
        Node<T> nodeToReturn;

        if (isEmpty()) return null;

        nodeToReturn = head;
        if (head.getNext() == null) tail = null;
        head = head.getNext();
        head.setPrev(null);
        return nodeToReturn;
    }

    /**
     * Time-complexity O(1)
     * @return  the removed node.
     */
    public Node<T> removeLast() {
        Node<T> nodeToReturn;
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        nodeToReturn = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    /**
     * Time-complexity O(n)
     */
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    /**
     * Time-complexity O(n)
     */
    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
