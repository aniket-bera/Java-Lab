import java.util.Scanner;
class Assignment5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of row: ");
        int row =  sc.nextInt();
        while (true) {
            System.out.println("1 --> Pattern 1");
            System.out.println("2 --> Pattern 2");
            System.out.println("3 --> Pattern 3");
            System.out.println("4 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: patten1(row);
                        break;
                case 2: pattern2(row);
                        break;
                case 3: pattern3(row);
                        break;
                case 4: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
    static void patten1 (int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2 (int r) {
        int a = 65;
        for (int i = 1; i <= r; i++) {
            for (int j = r; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k % 2 != 0) {
                    System.out.print((char) a+"");
                    a++;
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    static void pattern3 (int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(" ");
                if ((i + j) >= (r - 1)) {
                    System.out.print(i + j - r + 2);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}