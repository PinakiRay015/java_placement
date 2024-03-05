package Linklist_DSA.search;

import java.util.Scanner;

public class iterative {
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

        node1.next = node2;
        node2.next = node3;

        head = node1;
        tail = node3;
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int search(int key)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return -1;
        }
        Node temp = head;
        int index = 0;
        while(temp!=null)
        {
            if(temp.data == key)
            {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iterative ll = new iterative();
        ll.createNode();
        ll.display();
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        int ans = ll.search(key);
        System.out.println((ans == -1 ? "Element not present" : "element "+key+" is present at index "+ans));
    }
}
