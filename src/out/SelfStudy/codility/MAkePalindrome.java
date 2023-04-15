package out.SelfStudy.codility;

public class MAkePalindrome {
    public static void main(String[] args) {

        String s = "?ab??a?";

        System.out.println(solution(s));




    }
    public static String solution(String S) {

        String [] arr = S.split("");

        String result="";

        for (int i = 0; i <arr.length ; i++) {
            if (!(arr[i].equals(arr[arr.length - 1-i]) || arr[i].equals("?") || arr[arr.length - 1-i].equals("?"))){
                return "NO";

            } else if(arr[i].equals("?") && !arr[arr.length - 1-i].equals("?")){
                arr[i]=arr[arr.length - 1-i];
            } else if (arr[i].equals("?") && arr[arr.length - 1-i].equals("?")) {
                arr[i]="a";
                arr[arr.length - 1-i]="a";
            }


        }

        for (String s : arr) {
            result+=s;
        }

        return result;
        }



    }



