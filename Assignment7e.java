import java.util.Scanner;
class Draw {
    void rect (int n, char c) {
        System.out.println("Square:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    void rect (int l, int w, char c) {
        System.out.println("Rectangle:");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
class Assignment7e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side in Square: ");
        int sq = sc.nextInt();
        System.out.print("Enter length in Rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter width in Rectangle: ");
        int w = sc.nextInt();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        Draw d = new Draw();
        d.rect(sq, ch);
        d.rect(len, w, ch);
        sc.close();
    }
}