package out.SelfStudy.codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DigPow {
    public static void main(String[] args) {

        System.out.println(digPow(695, 2));





    }

    public static long digPow(int n, int p) {
        // your code
        String s = String.valueOf(n);
        List<Integer> list=Arrays.stream(s.split(""))
                .map(c->Integer.parseInt(c))
                .collect(Collectors.toList());
        int temp=0;

        for (int i = 0; i < list.size(); i++) {
            temp+=Math.pow(list.get(i),p+i);
        }

        if (temp%n==0){
            return temp/n;
        }else{
            return -1;
        }


    }

}
