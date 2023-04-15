package out.SelfStudy.day12CustomMethods;

public class emailDomain {
    public static void main(String[] args) {

        emailDomain("Cydeo@gmail.com");


    }
    public static void emailDomain(String email){

        System.out.println(email.substring(email.indexOf("@")+1,email.indexOf(".")));
    }


}
/*,
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */