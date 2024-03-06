package Linklist_DSA.search;

public class recursive {
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
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        head = node1;
        node1.next=node2;
        node2.next=node3;
        tail=node3;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int search(Node head , int key)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int index = search(head.next , key);
        if(index == -1)
        {
            return -1;
        }
        return index+1;
    }

    public static void main(String[] args)
    {
        recursive recursive = new recursive();
        recursive.createNode();
        recursive.display();
        int ans = recursive.search(head , 10);
        System.out.println(ans == -1 ? "Element is not present" : "Element present at index "+ans);
    }
}