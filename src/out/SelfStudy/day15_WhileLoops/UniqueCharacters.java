package out.SelfStudy.day15_WhileLoops;

public class UniqueCharacters {
    public static void main(String[] args) {


        System.out.println(uniqueCharacters("AABCCD"));

    }

    public static String uniqueCharacters (String input){
        String output="";
        for (int i = 0; i <input.length() ; i++) {
            if (input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i))){
                output+=""+input.charAt(i);
            }
        }
        return output;
    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */