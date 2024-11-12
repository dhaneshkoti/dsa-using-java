import java.util.*;
class Node 
{
    int data;
    Node next;
    Node(int num)
    {
        this.data=num;
        this.next=null;
    }
}
public class Singly_linked_list
{
    Node head=null;
    Node temp=null;
    public void sll(int num)
    {
        Node newnode=new Node(num);
        if(head==null)
        {
            head=temp=newnode;
        }
        else 
        {
            temp.next=newnode;
            temp=newnode;
        }
    }
    public void display()
    {
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Singly_linked_list list=new Singly_linked_list();
        int num;
        while(true)
        {
            num=sc.nextInt();///10 // 20 
            if(num==-1)//10==-1//20==-1 
            {
                break;
            }
            list.sll(num);///10 //20 
        }
        list.display();
    }
}
