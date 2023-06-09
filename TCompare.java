import java.util.Scanner;
class TCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st element: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd element: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd element: ");
        int c = sc.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.print("Maximum = "+max+"\nMinimum = "+min);
        sc.close();
    }
}
