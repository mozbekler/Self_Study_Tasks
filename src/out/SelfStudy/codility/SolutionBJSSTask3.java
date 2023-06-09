package out.SelfStudy.codility;

class SolutionBJSSTask3 {

    public static void main(String[] args) {
        int[] A ={1, 2,3,4,5, 9, 9, 9};

        System.out.println(solution(A,5));


    }

    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r +1) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}