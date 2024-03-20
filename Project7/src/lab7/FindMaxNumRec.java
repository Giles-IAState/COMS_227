package lab7;

public class FindMaxNumRec {

    public static void main(String[] args) {

        int[] test = {327, 34, 25, 18, 328, 2};
        int result = findMaxRec(test);
        System.out.println(result);
    }

    public static int findMaxRec(int[] arr) {
        return findMaxRec(arr, 0, arr.length - 1);
    }

    public static int findMaxRec(int[] arr, int start, int end) {

        if (start == end) {
            return arr[start];
        }
        else {
            int mid = (start + end) / 2;
            int leftMax = findMaxRec(arr, start, mid);
            int rightMax = findMaxRec(arr, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }
}
