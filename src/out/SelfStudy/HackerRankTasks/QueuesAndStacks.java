package out.SelfStudy.HackerRankTasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesAndStacks {

    public static void main(String[] args) {
        QueuesAndStacks p = new QueuesAndStacks();
        String input= "racecar";

        char[] s = input.toCharArray();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );


    }

    public LinkedList<Character> stringQueue = new LinkedList<>();
    public Stack<Character> stringStack = new Stack<>();

    public void pushCharacter(Character c){
        stringStack.push(c);
    }

    public void enqueueCharacter(Character c){
        stringQueue.add(c);
    }

    public Character popCharacter(){
        return stringStack.pop();
    }

    public Character dequeueCharacter(){
        return stringQueue.remove();
    }



}
