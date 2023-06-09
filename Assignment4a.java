import java.util.Scanner;
class Assignment4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double n = sc.nextDouble();
        double y = 1;
        for (int i = 0; i < n; i++) {
            y *= x;
        }
        System.out.print("Result = "+y);
        sc.close();
    }
}