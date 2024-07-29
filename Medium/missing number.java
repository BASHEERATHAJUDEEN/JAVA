public class MissingNumber {
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int total = n * (n + 1) / 2; 
        int sum = 0;
        for (int num : a) sum += num; 
        System.out.println("Missing number: " + (total - sum)); 
    }
}
