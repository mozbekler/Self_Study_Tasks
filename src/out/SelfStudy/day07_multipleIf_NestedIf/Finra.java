package out.SelfStudy.day07_multipleIf_NestedIf;

public class Finra {

    public static void main(String[] args) {

        int n=60;
        int fifteen = n%15;
        int five = n%5;
        int three =n%3;
        String result ="";

        if (fifteen == 0){
            result="FINRA";
        } else if (three==0) {
            result="FIN";
        } else if (five==0) {
            result="RA";
        }

        System.out.println(result);
    }
}
/*
Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5,
print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA

 */