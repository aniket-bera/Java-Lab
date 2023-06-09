import java.util.Scanner;
class NFibonacci {
    int fibo (int f) {
        if (f <= 1) {
            return f;
        }
        else {
            return (fibo(f - 1) + fibo(f - 2));
        }
    }
    void nfibo (int tr) {
        int p = 4;
        while (tr > 0) {
            int pt = fibo(p);
            int nt = fibo(p + 1);
            for (int i = (pt + 1); i < nt && tr > 0; i++) {
                System.out.print(i+" ");
                tr--;
            }
            p++;
        }
    }
}
class Assignment7c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms non-fibonacci series: ");
        int n = sc.nextInt();
        NFibonacci nf = new NFibonacci();
        nf.nfibo(n);
        sc.close();
    }
}