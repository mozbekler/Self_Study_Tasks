package out.SelfStudy.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
  public static void main(String[] args) {

    System.out.println(Arrays.toString(Kata.arrayDiff(new int[]{}, new int[]{})));



  }



  public static int[] arrayDiff(int[] a, int[] b) {

    if (b.length==0){
      return a;
    }else {
      List<Integer> list = new ArrayList<>();

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
          if (a[i] == b[j]) {
            list.add(i);
          }
        }
      }

      int[] c = new int[list.size()];
      for (Integer integer : list) {
        c = new int[]{a[list.get(integer)]};
      }


      return c;

      /*
      if (b.length==0){
      return a;
    }else{
      List<Integer> list = new ArrayList<>();

      for (int ai : a) {
        for (int bi : b) {
          if (ai!=bi){
            list.add(ai);
          }
        }
      }

      int[] c = new int[list.size()];

      for (int i = 0; i < list.size(); i++) {
        c[i]=list.get(i);
      }


      return c;
    }
       */
    }


  }

}