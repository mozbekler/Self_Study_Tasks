package out.SelfStudy.codility;
import java.util.*;
import java.util.stream.Collectors;

public class BJSS {


    class Solution {
        public int solution(String S) {
            // Implement your solution here

            Queue<String> queue = new LinkedList<>();
            Stack <Integer> stack  = new Stack<>();

            queue.addAll(Arrays.asList(S.split(" ")));

            while(!queue.isEmpty()){
                if(queue.peek().equals("+")){
                    stack.push(stack.pop()+stack.pop());
                }
                else if(queue.peek().equals("-")){
                    if(stack.size() >1) stack.push(stack.pop()-stack.pop());
                    else return -1;
                }
                else if(queue.peek().equals("POP")){
                    stack.pop();
                }
                else if(queue.peek().equals("DUP")){
                    stack.push(stack.peek());
                } else {
                    stack.push(Integer.valueOf(queue.peek()));
                }queue.poll();
                if(!stack.isEmpty() && (stack.peek()<0 || stack.peek()>1048575)) return -1;
            }

            if(stack.isEmpty()) return -1;
            if(stack.peek()<0) return -1;
            return stack.peek();

        }
    }

    class Task1{
        public int solution(String[] A) {
            // Implement your solution here
            Map <String, Integer> map = new HashMap<>();

            for(int i = 0; i<  A.length; i++){
                map.put(A[i],map.getOrDefault(A[i],0)+1);
            }

            return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(p, k)->p,LinkedHashMap::new))
                    .values().stream().max(Integer::compareTo).get();
    }

}
}

