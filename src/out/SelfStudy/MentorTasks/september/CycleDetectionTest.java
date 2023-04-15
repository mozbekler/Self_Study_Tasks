package out.SelfStudy.MentorTasks.september;

public class CycleDetectionTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next;
        //System.out.println(detectCycle2(listNode).val);
    }
}


