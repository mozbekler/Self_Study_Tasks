package out.SelfStudy.day06_ifStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a, b, c;

        a=130;
        b=13;
        c=29;

        if (a>=b && b>=c){
            System.out.println(b+ " is the  median number.");} if (a>=c && c>=b){
            System.out.println(c+ " is the  median number.");} if (b>=a && a>=c){
            System.out.println(a+ " is the  median number.");} if (b>=c && c>=a){
            System.out.println(c+ " is the  median number.");} if (c>=a && a>=b){
            System.out.println(a+ " is the  median number.");} if (c>=b && b>=a){
            System.out.println(b+ " is the  median number.");}



//abc, acb, bac, bca, cab, cba

    }
}
/*

 Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */