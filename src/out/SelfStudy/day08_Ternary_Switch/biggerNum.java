package out.SelfStudy.day08_Ternary_Switch;

public class biggerNum {

    public static void main(String[] args) {

        int n1=5;
        int n2=5;
        int n3=8;
        String result ="";

        result =(n1==n2 && n2==n3)? "n1,n2 and n3 are all equal":(n1==n2 && n2>n3)? "n1 and n2 are equal and bigger than n3": (n1==n3 && n3>n2)? "n1 and n3 are equal and bigger than n2":(n2==n3 && n3>n1)? "n2 and n3 are equal and bigger than n1": ((n1>n2 && n2>=n3) || (n1>n3 && n3>=n2))? "n1 is the biggest" : ((n2>n1 && n1>=n3) || (n2>n3 && n3>=n1))? "n2 is the biggest" : "n3 is the biggest" ;

        System.out.println(result);


    }
}
/*
write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY


 */