package out.SelfStudy.MentorTasks.November;



public class DeleteNNodesAfterMNodes {

    public static void main(String[] args) {

        Node head= new Node(1);
        Node current= head;


        for (int i = 2; i < 14; i++) {
            current.next=new Node(i);
            current=current.next;
        }

        printNodes(head);


        deleteNAfterM(head,2,3);

        printNodes(head);





    }

    public static class Node {
        int id;
        Node next;

        public Node(int id) {
            this.id = id;
        }
    }

    static void printNodes(Node head){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+"=> ");
            }
            current=current.next;
        }
    }

    public static Node deleteNAfterM(Node head, int m, int n){

        Node p = head;
        Node d= head;


        while(d.next!=null){
            for (int i = 1; i < m; i++) {
               p=p.next;
               d=p;
            }

            for (int i = 0; i < n; i++) {
                if (d.next!=null) d=d.next;
            }
            p.next=d.next;
            if (p.next!=null) p=p.next;
            d=p;



        }


        return head;
    }





}
