import java.util.Scanner;
class TOH {
    int i = 1;
    void th (int n, char a, char b, char c) {
        if (n > 0) {
            th(n - 1, a, c, b);
            System.out.println((i++)+") "+a+" --> "+c);
            th(n - 1, b, a, c);
        }
    }
}
class Assignment7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of disk: ");
        int n = sc.nextInt();
        TOH toh = new TOH();
        toh.th(n, 'A', 'B', 'C');
        sc.close();
    }
}