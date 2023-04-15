package out.SelfStudy.day08_Ternary_Switch;

public class Loans {

    public static void main(String[] args) {

        int salary = 70000;
        int creditScore=750;
        String result="";

        result =(salary>=60000)?(
                result =(creditScore>=650)? "Loan Approved" : "Loan denied"
                )
                :"Loan denied";

        System.out.println(result);

    }
}

/*
Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.


 */