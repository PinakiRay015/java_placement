package LinkedList;

public class Sample1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public void addFirst(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=tail=newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        s1.addFirst(1);
        s1.addFirst(2);
        s1.addLast(100);
    }
}
