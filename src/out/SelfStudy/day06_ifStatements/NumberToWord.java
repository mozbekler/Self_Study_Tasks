package out.SelfStudy.day06_ifStatements;

public class NumberToWord {

    public static void main(String[] args) {

        int number;

        number=9;
        String result="";

        if (number==1){result="one";}
        if (number==2){result="two";}
        if (number==3){result="three";}
        if (number==4){result="four";}
        if (number==5){result="five";}
        if (number==6){result="six";}
        if (number==7){result="seven";}
        if (number==8){result="eight";}
        if (number==9){result="nine";}


        System.out.println(result);


    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */