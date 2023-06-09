import java.util.Scanner;
class Assignment5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int s =  sc.nextInt();
        System.out.print("Enter ending no.: ");
        int e = sc.nextInt();
        System.out.print("Automorphic numbers from "+s+" to "+e+" are:");
        for (int i = s; i <= e; i++) {
            int n = String.valueOf(i).length();
            double end = (Math.pow(i, 2)) % (Math.pow(10, n));
            if (i == end) {
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}