package out.SelfStudy.day08_Ternary_Switch;

public class AgeGroups {
    public static void main(String[] args) {

        int age =-9;
        String result ="";

        result = (age>=1 && age<=2)? "infant" :(age>=3 && age<=5)? "toddler" :(age>=6 && age<=9)? "kid" :(age>=10 && age<=12)? "Pre-teen" :(age>=13 && age<=17)? "Teenager" :(age>=18 && age<=20)? "Young adult" :(age>=21 && age<=39)? "Adult" :(age>=40 && age<=49)? "Young Middle-Aged Adult" :(age>=50 && age<=54)? "Middle-Aged Adult" :(age>=55 && age<=64)? "Very Young Senior Citizen" :(age>=65 && age<=74)? "Young Senior Citizen" :(age>=75 && age<=84)? "Senior Citizen" :(age>=85 )? "Old Senior Citizen" : "Invalid Value";

        System.out.println(result);

    }

}
/*
Write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary


 */