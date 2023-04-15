package out.SelfStudy.day14_overloading_loops;

public class Factorial {

    public static void main(String[] args) {

        int r=0;

        int factorial=1;

        for (int i = 1; i <=r ; i++) {

            factorial=factorial*i;

        }
        if(r>=0){
            System.out.println("result is "+factorial);
        }else{
            System.out.println("Invalid value to calculate factorial");
        }

    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */