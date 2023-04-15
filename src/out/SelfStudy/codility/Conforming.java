package out.SelfStudy.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conforming {
    public static void main(String[] args) {



        int  a=solution(1073741727,1073741631,1073741679);
        System.out.println(a);

    }

    public static int solution(int A, int B, int C){

        String num1 = String.valueOf(Integer.toBinaryString(A));

        int countZero1=0;

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i)=='0'){
                countZero1++;
            }
        }

        String num2 = String.valueOf(Integer.toBinaryString(B));
        int countZero2=0;

        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i)=='0'){
                countZero2++;
            }
        }

        String num3 = String.valueOf(Integer.toBinaryString(C));

        int countZero3=0;

        for (int i = 0; i < num3.length(); i++) {
            if (num3.charAt(i)=='0'){
                countZero3++;
            }
        }


        return countZero1*countZero2*countZero3;
    }
}
/*
In this problem we consider unsigned 30-bit integers, i.e. all integers B such that 0 ≤ B < 2 #30.

We say that integer A conforms to integer B if, in all positions where B has bits set to 1, A has corresponding bits set to 1.

For example:

00 0000 1111 0111 1101 1110 0000 1111(BIN) = 16,244,239 conforms to
00 0000 1100 0110 1101 1110 0000 0001(BIN) = 13,032,961, but
11 0000 1101 0111 0000 1010 0000 0101(BIN) = 819,399,173 does not conform to
00 0000 1001 0110 0011 0011 0000 1111(BIN) = 9,843,471.
Write a function:

class Solution { public int solution(int A, int B, int C); }

that, given three unsigned 30-bit integers A, B and C, returns the number of unsigned 30-bit integers conforming to at least one of the given integers.

For example, for integers:

A = 11 1111 1111 1111 1111 1111 1001 1111(BIN) = 1,073,741,727,
B = 11 1111 1111 1111 1111 1111 0011 1111(BIN) = 1073741631, and
C = 11 1111 1111 1111 1111 1111 0110 1111(BIN) = 1073741679,
the function should return 8, since there are 8 unsigned 30-bit integers conforming to A, B or C, namely:

11 1111 1111 1111 1111 1111 0011 1111(BIN) = 1,073,741,631, same
11 1111 1111 1111 1111 1111 0110 1111(BIN) = 1,073,741,679, same
11 1111 1111 1111 1111 1111 0111 1111(BIN) = 1,073,741,695,
11 1111 1111 1111 1111 1111 1001 1111(BIN) = 1,073,741,727, same
11 1111 1111 1111 1111 1111 1011 1111(BIN) = 1,073,741,759,
11 1111 1111 1111 1111 1111 1101 1111(BIN) = 1,073,741,791,
11 1111 1111 1111 1111 1111 1110 1111(BIN) = 1,073,741,807,
11 1111 1111 1111 1111 1111 1111 1111(BIN) = 1,073,741,823.
Write an efficient algorithm for the following assumptions:

A, B and C are integers within the range [0..1,073,741,823].
 */