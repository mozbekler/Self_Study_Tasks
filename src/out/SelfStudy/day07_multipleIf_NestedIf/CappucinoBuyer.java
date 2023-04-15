package out.SelfStudy.day07_multipleIf_NestedIf;

public class CappucinoBuyer {

    public static void main(String[] args) {

        String typeOfCappuccino = "venti";
        String output="";

        if (typeOfCappuccino == "tall" || typeOfCappuccino == "grande" || typeOfCappuccino == "venti"){

            if (typeOfCappuccino =="tall") {output= "tall \nprice is $3.69\n" +
                    "90 calories";}
            else if (typeOfCappuccino =="grande") {output="grande \nprice is $3.99;\n" +
                    "120 calories";}
            else if (typeOfCappuccino=="venti"){output="venti \nprice is $4.29\n" +
                    "150 calories";}
         else {output = "Invalid Size";}

        System.out.println(output);


        }


    }
}
/*
A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if


 */