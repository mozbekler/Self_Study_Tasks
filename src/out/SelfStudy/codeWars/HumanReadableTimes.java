package out.SelfStudy.codeWars;

public class HumanReadableTimes {

    public static void main(String[] args) {

        System.out.println(makeReadable(5));

    }

    public static String makeReadable(int seconds) {
        // Do something
        String s="";
        String m="";
        String h="";

        int minutes=0;
        int hours=0;

        if (seconds>59){
            minutes=seconds/60;
            seconds=seconds%60;
        }
        if(seconds<10){
            s+="0"+seconds;
        }else{
            s+=seconds;
        }

        if (minutes>59){
            hours=minutes/60;
            minutes=minutes%60;
        }

        if (minutes<10){
            m+="0"+minutes;
        }else {
            m+=minutes;
        }

        if (hours<10){
            h+="0"+hours;
        }else{
            h+=hours;
        }

        String str=h+":"+m+":"+s;





        return str;
    }
}
