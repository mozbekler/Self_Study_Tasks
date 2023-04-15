package out.SelfStudy.HackerRankTasks;

import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
      if(head == null) return null;
      Node ptr1 = head;
      Node ptr2 = ptr1.next;
      Node temp;
      while(ptr1.next != null){
          if(ptr1.data == ptr2.data){
              temp = ptr2.next;
              ptr1.next = temp;
              ptr2 = temp;
          }
          if (ptr1.data != ptr2.data){
              ptr1 = ptr1.next;
              ptr2= ptr2.next;
          } else if (ptr2.next==null) {
              ptr1.next=null;
              break;
          }


      }
      return head;
    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }