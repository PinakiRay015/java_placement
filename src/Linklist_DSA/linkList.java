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
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.display();
        ll.addLast(56);
        System.out.println("");
        ll.display();
    }
}
