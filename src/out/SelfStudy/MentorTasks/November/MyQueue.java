package out.SelfStudy.MentorTasks.November;

import java.util.Stack;

public class MyQueue {



    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.peek());    // should print 1
        System.out.println(q.dequeue()); // should print 1
        q.enqueue(3);
        System.out.println(q.isEmpty()); // should print false
        System.out.println(q.dequeue()); // should print 2
        System.out.println(q.dequeue()); // should print 3
        System.out.println(q.isEmpty()); // should print true
    }

    Stack<Integer> stack1 = new Stack<>();


    Stack<Integer> stack2 = new Stack<>();


    public void enqueue(int num) {
        //todo
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());

        }
        stack1.push(num);


    }


    public int dequeue() throws Exception {
        //todo

        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("ERROR");
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());

        }

          return stack2.pop();
    }


    public int peek() throws Exception {
        //todo
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("ERROR");
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }


        return stack2.peek();
    }


    public boolean isEmpty() {
         return stack1.size()==0 && stack2.size()==0;

    }
}

