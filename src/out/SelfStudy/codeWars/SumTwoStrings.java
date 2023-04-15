package out.SelfStudy.codeWars;

public class SumTwoStrings {
    public static void main(String[] args) {

        String a= "123";
        String b= "456";

        System.out.println(sumStrings(a,b));


    }
    public static String sumStrings(String a, String b) {

        int valA=Integer.parseInt(a);
        int valB=Integer.parseInt(b);

        int sum= valA+valB;




        return String.valueOf(sum);
    }
}
