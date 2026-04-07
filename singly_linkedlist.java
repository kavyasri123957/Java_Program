import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int value)
    {
        data = value;
        next = null;
    }
}
public class singly_linkedlist{
    Node head;
    public void insert(int value)
    {
        Node newNode = new Node(value);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public void delete(int value)
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.data == value)
        {
            head = head.next;
            System.out.println("deleted" + value);
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != value)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            System.out.println("value not found");
        }
        else
        {
            temp.next = temp.next.next;
            System.out.println("deleted" + value);
        }
    }
    public void search(int value)
    {
        Node temp = head;
        int position = 1;
        while(temp!=null)
        {
            if(temp.data == value)
            {
                System.out.println("value found at position" + position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("value not found in list");
    }
    public void display()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("list is empty");
            return;
        }
        System.out.print("linked list elements are");
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        singly_linkedlist list = new singly_linkedlist();
        while(true)
        {
            System.out.println("enter option");
            System.out.println("1 insert");
            System.out.println("2 delete");
            System.out.println("3 search");
            System.out.println("4 display");
            System.out.println("5 exit");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                System.out.print("enter value to insert");
                list.insert(sc.nextInt());
            }
            else if(choice == 2)
            {
                System.out.print("enter value to delete");
                list.delete(sc.nextInt());
            }
            else if(choice == 3)
            {
                System.out.print("enter value to search");
                list.search(sc.nextInt());
            }
            else if(choice == 4)
            {
                list.display();
            }
            else if(choice == 5)
            {
                System.out.println("program ended");
                break;
            }
            else
            {
                System.out.println("invalid choice");
            }
        }
    }
}
