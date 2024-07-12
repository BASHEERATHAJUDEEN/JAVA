import java.util.Scanner;
public class Sqp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows=s.nextInt();
        int n=1;
        for (int i=1;i<=numRows;i++) {
            for (int j=1;j<=i;j++) {
                System.out.printf("%-5d", n*n); 
                n++;
            }
            System.out.println();
        }
        s.close();
    }
}
