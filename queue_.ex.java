import java.util.*;
class queue_ex{

    int front=0,rear=0,size=0;
    int capacity=100;
    int[] queue=new int[capacity];
    void enqueue(int data)
    {
        if(size==capacity) System.out.println(" Queue overflow");
        else
        {
            queue[rear]=data;
            rear=(rear+1) % capacity;
            size++;
            System.out.println(data +"enqueued");
        }
    }
    void dequeue()
    {
        if(size==0) System.out.println("Queue Underflow");
        else
        {
            System.out.println(queue[front] + "dequeued");
            front =(front+1) % capacity;
            size--;
        }
    }
    void display()
    {
        System.out.println("Queue elements:");
        for(int i=0;i<size;i++) 
        System.out.println(queue[(front+i) % capacity]);
    }
    public static void main(String[] args){
        queue_ex q=new queue_ex();
        q.enqueue(5);
        q.enqueue(10);
        q.display();
        q.display();
        q.display();
    }
}