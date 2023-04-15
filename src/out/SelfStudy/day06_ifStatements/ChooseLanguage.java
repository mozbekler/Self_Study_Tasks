package out.SelfStudy.day06_ifStatements;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection=5;

        boolean for1=selection==1;
        boolean for2=selection==2;
        boolean for3=selection==3;
        boolean for4=selection==4;
        boolean for5=selection==5;

        String output="";

        if (for1){output="Hello, thank for your call";}
        if (for2){output="Hola, gracias para llamar";}
        if (for3){output="Merhaba, aradiginiz icin tesekkurler";}
        if (for4){output="Privet, spasibo za vash zvonok";}
        if (for5){output="Merci ,pour votre appel";}

        System.out.println(output);



    }
}
/*
Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement

 */