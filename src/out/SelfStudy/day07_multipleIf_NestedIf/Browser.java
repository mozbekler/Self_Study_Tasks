package out.SelfStudy.day07_multipleIf_NestedIf;

public class Browser {

    public static void main(String[] args) {

        String browserName ="edge";
        String output ="";

        if (browserName=="chrome" || browserName =="firefox" || browserName == "opera" || browserName =="safari" || browserName=="edge")
        {output = browserName + " browser is selected";
        } else {output ="Invalid browser name";}

            System.out.println(output);



        }
}
/*
Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */