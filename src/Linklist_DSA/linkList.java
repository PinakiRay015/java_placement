//java program to add an element at the beginning of the link list and at the end of the link list and displaying them
package Linklist_DSA;

public class linkList {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void createNode()
    {
        Node Node1 = new Node(10);
        Node Node2 = new Node(20);
        Node Node3 = new Node(30);

        Node1.next = Node2;
        Node2.next = Node3;

        head = Node1;
        tail = Node3;
    }

    //adding the element at first
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    //adding elements at the end
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //displaying element
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        linkList ll = new linkList();
        System.out.println("Creating a node");
        ll.createNode();
        ll.display();
        System.out.println("\nAdding the element at first");
        ll.addFirst(5);
        ll.display();
        ll.addLast(56);
        System.out.println("\nAdding the element at last");
        ll.display();
    }
}
