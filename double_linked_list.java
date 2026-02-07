class DoubleLL {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    Node head;

    void insertFront(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();

        // Insert elements
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);

        System.out.println("Initial Doubly Linked List:");
        list.display();
        list.deleteFront();
        list.display();
        list.deleteEnd();
        list.display();
    }
}
