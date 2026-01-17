public class MaxSubarrayApp {

    public static int bruteMaxSubarray(int[] lst) {
        int maxSum = lst[0];

        for (int i = 0; i < lst.length; i ++){
            int tempSum = 0;
            for (int j = i; j < lst.length; j ++) {
                tempSum += lst[j];
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        return maxSum;
    }


    public static int kadanesMaxSubarray(int[] lst) {
        int right = 0;
        int maxSum = lst[0];
        int tempSum = 0;

        while (right < lst.length) {
            tempSum += lst[right];
            maxSum = Math.max(maxSum, tempSum);
            if (tempSum < 0) tempSum = 0;
            right ++;
        }
        return maxSum;
    }


    public static int kadanesMaxSubarraySimple(int[] lst) {
        int maxSum = lst[0];
        int curSum = 0;

        for (int n : lst) {
            curSum = Math.max(curSum, 0);
            curSum += n;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;

    }


    public static void main(String[] args) {
        int[] lst = {2, -3, 4, -2, 2, 1, -1, 4};
        System.out.println(bruteMaxSubarray(lst));
        System.out.println(kadanesMaxSubarray(lst));
        System.out.println(kadanesMaxSubarraySimple(lst));
    }



}