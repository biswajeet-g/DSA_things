class singlell{
    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    Node head;

    void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void insertEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head =newNode;
            return;

        }

        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }

    void deleteFront(){
        if (head == null) {
            System.out.println("List is empty!") ;
            return ;
        }
        head = head.next;
    }

    void deleteEnd(){
        if (head == null) {
            System.out.println("List is empty!") ;
            return ;
        }
        if ( head.next == null){
            head = null ;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

    }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("NULL");
    }



    public static void main(String[] args){
            singlell list = new singlell();

            list.insertFront(10);
            list.insertFront(20);
            list.insertFront(30);
            list.insertEnd(50);
            list.insertEnd(80);
            list.insertEnd(100);
            list.deleteEnd();


            list.display();
    }
}

/*public static void main(String[] args){
    byte v =10;
}*/