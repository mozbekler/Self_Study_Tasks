package out.SelfStudy.day10_StringMethods;

import java.util.Scanner;

public class ValidWebSiteName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the website");

        String webName = input.next();

        if (webName.startsWith("www.") && webName.endsWith(".com") || webName.startsWith("www.") && webName.endsWith(".edu") || webName.startsWith("www.") && webName.endsWith(".gov")){
            System.out.println("Valid website name");
        } else {
            System.out.println("invalid website name");
        }


        input.close();
    }
}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov
 */