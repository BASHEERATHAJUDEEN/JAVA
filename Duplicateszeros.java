import java.util.Arrays;
public class dz {
    public static void dze(int[] arr) {
        int n=arr.length;
        int z=0;
        for (int num : arr) {
            if (num == 0) {
                z++;
            }
        }
        int i=n-1;
        int j=n+z-1;
        while (i< j) {
            if (j < n) {
                arr[j] = arr[i];
            }
            j--;
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            i--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        dze(arr);
        System.out.println("Output: " + Arrays.toString(arr));  
    }
}
