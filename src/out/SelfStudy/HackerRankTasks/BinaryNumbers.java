package out.SelfStudy.HackerRankTasks;

public class BinaryNumbers {

    public static void main(String[] args) {

        int n=1;

        String binary= Integer.toBinaryString(n);



        int count1=0;
        int result=0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i)=='1'){
                count1++;
                if ((i+1)==binary.length() && result<count1){
                    result=count1;
                }
            }else{
                if (result<count1){
                    result=count1;
                }
                count1=0;
            }
        }

        System.out.println(result);

    }
}
