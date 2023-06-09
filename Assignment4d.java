import java.util.Scanner;
class Assignment4d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;
        while (n > 0) {
            int temp2 = n % 10;
            rev = (rev * 10) + temp2;
            n = (n / 10);
        }
        System.out.println("Reverse number: "+rev);
        if (temp == rev) {
            System.out.print("The number is palindrome");
        }
        else {
            System.out.print("The number is not palindrome");
        }
        sc.close();
    }
}
