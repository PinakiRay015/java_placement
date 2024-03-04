package Linklist_DSA;
import java.util.Scanner;

public class linklist {
    Scanner sc = new Scanner(System.in);
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
    public static int size;

    public void createNode()
    {
        Node node1 = new Node(10);
        size++;
        Node node2 = new Node(20);
        size++;
        Node node3 = new Node(30);
        size++;

        node1.next = node2;
        node2.next = node3;

        head = node1;
        tail = node3;

        System.out.println("======Linked list created======");
    }

    public void addFirst()
    {
        System.out.println("Enter the data");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

        System.out.println("======Element added at first======");
    }

    public void addMiddle()
    {
        System.out.println("Enter the value");
        int value = sc.nextInt();
        System.out.println("Enter the position where you want to insert the element");
        int index = sc.nextInt();
        Node temp = head;
        int i = 0;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(value);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("======Element added at "+index+" position======");
    }

    public static int deleteFirst()
    {
        int val = head.data;
        head = head.next;
        System.out.println("======Element deleted======");
        size--;
        return val;

    }

    public void display()
    {
        Node temp = head;
        if(temp==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size of the linked list is "+size);
    }
    public static void main(String[] args) {
        linklist ll = new linklist();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1->Create a link list");
            System.out.println("2->Display link list");
            System.out.println("3->Add element at first");
            System.out.println("4->Add element at middle");
            System.out.println("5->Delete at first");
            System.out.println("0->quit");
            System.out.println("Enter the option");
            int value = sc.nextInt();
            switch (value)
            {
                case 1->ll.createNode();
                case 2->ll.display();
                case 3->ll.addFirst();
                case 4->ll.addMiddle();
                case 5->ll.deleteFirst();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Enter a valid option");
            }
        }
    }
}
