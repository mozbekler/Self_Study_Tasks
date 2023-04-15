package out.SelfStudy.codeWars;

import java.util.Arrays;

public class BitCounting {
    public static void main(String[] args) {

        System.out.println(countBits(1234));




    }
    public static int countBits(int n){
        // Show me the code!
        String binary="";
        int div=3;

        while(div>1){
            int rem = n %2;
            binary+=rem;
            n/=2;
            div=n;

            if(div==1){
                binary+=div;
            }

        }
        return (int) Arrays.stream(binary.split(""))
                .filter(l->l.equals("1"))
                .count();




    }

}
