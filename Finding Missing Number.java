public class MissingNumberFinder {
    public static int fm(int[] ns) {
        int n = ns.length;
        int esum=n*(n+1)/2; 
        int asum=0;
        for (int nm:ns) {
            asum+= nm;
        }
        return esum-asum;
    }
    public static void main(String[] args) {
        int[] ns= {3, 0, 1};
        int m=fm(ns);
        System.out.println("Output: " + m);  
    }
}
