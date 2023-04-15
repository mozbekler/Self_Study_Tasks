package out.SelfStudy.MentorTasks.April_May;


public class Emojis {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        //to print Emoji in java program, we need to use the Unicode
        // (https://apps.timwhitlock.info/emoji/tables/unicode)

        String grinningFacesSurrogates = "\uD83D\uDE01";
        System.out.println("\uD83D\uDE01");

        String rocketSurrogates = "\uD83D\uDE80";
        System.out.println("\uD83D\uDE80");

        String winkingFaceSurrogates = "\uD83D\uDE09";
        System.out.println("\uD83D\uDE09");

        String alienSurrogates = "\uD83D\uDC7D";
        System.out.println("\uD83D\uDC7D");




        // Main driver method

            // Printing the text on console prior adding
            // the desired color
            System.out.println(ANSI_YELLOW
                    + "This text is yellow"
                    + ANSI_RESET);
    }
}
