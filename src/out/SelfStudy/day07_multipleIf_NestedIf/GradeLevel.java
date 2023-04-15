package out.SelfStudy.day07_multipleIf_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 0;
        String result ="";

        if (grade>=1 && grade<=18){
            if (grade<=5){
                result="Elementary school";
            } else if (grade<=8) {
                result="Middle school";
            } else if (grade<=12) {
                result="High school";
            }else if (grade<=16) {
                result="College";
            }else{
                result="Grad school";
            }

        }else {
            result="Invalid grade level given";
        }

        System.out.println(result);



    }

}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */