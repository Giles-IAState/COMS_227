package lab7;

public class GetPyramidCount {

    public static void main(String[] args) {
        int result = getPyramidCount(4);
        System.out.println(result);
    }

    public static int getPyramidCount(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n * n + getPyramidCount(n - 1);
        }
    }
}
