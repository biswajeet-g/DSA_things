class circularLinkedList{

    void insertEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next=head;
            return;
        }

        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
            temp.next=newNode;
            newNode.next=head;
        }
    }

        void display(){
            if (head ==  null) return;

            Node temp=head;
            do { 
                System.out.print(temp.data+"->");
                temp=temp.next;
            } while (temp!=head);
            System.out.println("(back to head)");
        }
public class circularLinkedList {
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(20);
        list.display();
    }
    
}
}