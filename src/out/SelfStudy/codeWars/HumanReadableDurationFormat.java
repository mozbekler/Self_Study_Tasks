package out.SelfStudy.codeWars;

public class HumanReadableDurationFormat {

    public static void main(String[] args) {




    }
    public static String formatDuration(int seconds) {
        // your code goes here
        int minutes=seconds/60;
        int secRem=seconds%60;
        int hours = minutes/60;
        int minRem= minutes%60;
        int days = hours/24;
        int hourRem= hours%24;
        int years  = days/365;
        int dayRem= days%365;

        String format="";

        if (seconds==0){
            format+="now";
        } else if (seconds==1) {

        } else if (seconds<60) {
            format+=seconds+" seconds";
        } else if (seconds==60) {
            format+="1 minute";
        } else if (seconds<3600) {
            if (secRem!=0){

            }

        }

        return format;
    }
}
