package out.SelfStudy.day12CustomMethods;

public class Month {

    public static void main(String[] args) {

        month("     AUgust");

       }

    private static void month(String month) {

        month=month.trim();

       if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("july" )|| month.equalsIgnoreCase("august") || month .equalsIgnoreCase("october") || month .equalsIgnoreCase("december")){
            System.out.println(month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase()+" has 31 days.");
        } else if (month.equalsIgnoreCase("april") || month.equalsIgnoreCase("june") || month .equalsIgnoreCase("september") || month .equalsIgnoreCase("november")) {
           System.out.println(month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase()+" has 30 days.");
        } else if (month.equalsIgnoreCase("february")) {
           System.out.println(month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase()+" has 28 or 29 days.");
        }else {
           System.err.println("Invalid month");
       }


    }


}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */