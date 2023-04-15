package out.SelfStudy.codeWars;

public class ConvertAstringToANumber {

    public static void main(String[] args) {
        String s= "51234";


        System.out.println(ConvertToNumber(s));
    }



    public static int ConvertToNumber (String str){
        double num=0;

        char [] charArray= str.toCharArray();

        double exp=0;

        for (int i = charArray.length-1; i >=0; i--) {

            num+=(charArray[i]-48)*Math.pow(10,exp);

            exp++;


        }


        return (int)num;
    }

}






