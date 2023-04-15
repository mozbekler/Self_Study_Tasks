package out.SelfStudy.day06_ifStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int level;
        level=70;
        String output="";


        boolean above90=level>=90;
        boolean above80=level>=80 && level<90;
        boolean above70=level>=70 && level<80;
        boolean above60=level>=60 && level<70;
        boolean above50=level>=50 && level<60;
        boolean below50=level<50;

        if (above90){output="Your tank is full";}
        if (above80){output="Still okay";}
        if (above70){output="Don't go too far";}
        if (above60){output="Start to head back";}
        if (above50){output="Be careful now you at 50%";}
        if (below50) {output="WARNING Low Oxygen Level";}

        System.out.println(output);




    }
}
/*
You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */