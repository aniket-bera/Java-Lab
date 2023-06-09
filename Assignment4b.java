import java.util.Scanner;
class Assignment4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many term: ");
        int t = sc.nextInt();
        long n1 = 0L, n2 = 1L;
        System.out.print("Fibonacci series:");
        for (int i = 0; i < t ; i++) {
            System.out.print(" "+n1);
            long temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        sc.close();
    }
}
