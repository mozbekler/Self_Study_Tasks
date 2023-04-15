package out.SelfStudy.day28_encapsulation;

public class Credentials {
    private String userName,password;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        if (password==null){
            System.err.println("Password must be entered");
            System.exit(1);
        }
        return password;
    }
    public void setPassword(String password) {
        if (!isStrongPassword(password)){
            System.err.println("WEAK PASSWORD: It must contain at least 1 letter,1 digit, 1 Special Character. No SPaces and it must be at least 8 characters.");
            System.exit(1);
        }
        this.password = password;
    }
    public boolean isStrongPassword(String password){
        char[] pwChar=password.toCharArray();

        int countLetter=0;

        for (char c : pwChar) {
            if (Character.isLetter(c)){
                countLetter++;
            }
        }
        int countDigit=0;

        for (char c : pwChar) {
            if (Character.isDigit(c)){
                countDigit++;
            }
        }
        int countSpecialChar=0;

        for (char c : pwChar) {
            if (!(Character.isLetterOrDigit(c))){
                countSpecialChar++;
            }
        }
        int countSpace=0;

        for (char c : pwChar) {
            if (Character.isSpaceChar(c)){
                countSpace++;
            }
        }

        return pwChar.length >= 8 && countLetter >= 1 && countDigit >= 1 && countSpecialChar>=1 && countSpace <= 0;
    }

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()

 */
