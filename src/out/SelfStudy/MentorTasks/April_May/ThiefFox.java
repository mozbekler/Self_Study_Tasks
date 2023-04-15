package out.SelfStudy.MentorTasks.April_May;

public class ThiefFox {

        public static void main(String[] args) {
            boolean fox1WearsCoat = true;
            boolean fox2WearsCoat = true;
            boolean fox3WearsCoat = true;
            boolean fox4WearsCoat = false;

            boolean fox1HasATorch = true;
            boolean fox2HasATorch = true;
            boolean fox3HasATorch = true;
            boolean fox4HasATorch = true;

            String fox1CoatColor = "BLACK";
            String fox2CoatColor = "BLACK";
            String fox3CoatColor = "BLACK";
            String fox4CoatColor = "GRAY";

            int fox1BagCount = 0;
            int fox2BagCount = 2;
            int fox3BagCount = 3;
            int fox4BagCount = 3;

            if (fox1WearsCoat && fox1CoatColor.equals("BLACK") && fox1HasATorch && fox1BagCount == 3) {
                System.out.println("Fox1 might be one of suspects");
            }else {
                System.out.println("Fox1 is cleared of charges");
            }

            if (fox2WearsCoat && fox2CoatColor.equals("BLACK") && fox2HasATorch && fox2BagCount == 3) {
                System.out.println("Fox2 might be one of suspects");
            }else {
                System.out.println("Fox2 is cleared of charges");
            }
            if (fox3WearsCoat && fox3CoatColor.equals("BLACK") && fox3HasATorch && fox3BagCount == 3) {
                System.out.println("Fox3 might be one of suspects");
            }else {
                System.out.println("Fox3 is cleared of charges");
            }

            if (fox4WearsCoat && fox4CoatColor.equals("BLACK") && fox4HasATorch && fox4BagCount == 3) {
                System.out.println("Fox4 might be one of suspects!");
            }else {
                System.out.println("Fox4 is cleared of charges");
            }


        }
    }

