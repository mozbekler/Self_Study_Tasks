package out.SelfStudy.MentorTasks.November;

import java.util.Stack;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World 123456789";

        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord (String s){

        String a=s.trim();

        Stack<Character> words = new Stack<>();
        for (int i = 0; i<a.length(); i++) {

            words.push(a.charAt(i));
        }
        char temp='a';
        int count=-1;
        while(temp!=' '){
            temp=words.pop();
            count++;
        }


        return count;

    }
}
