public class LargestSumSubarray {
    public static int maxSubArray(int[] n) {
        int maxSum = n[0];
        int Sum = n[0];
        for (int i=1;i<n.length;i++) {
            Sum = Math.max(n[i],Sum+n[i]);
            maxSum = Math.max(maxSum,Sum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] n= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int r= maxSubArray(n);
        System.out.println("Output: " + r);  
    }
}
