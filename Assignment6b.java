import java.util.*;
class Assignment6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[6];
        int[] q = new int[4];
        int[] r = new int[10];
        System.out.println("Enter 6 array element for P:");
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        System.out.println("Enter 4 array element for Q:");
        for (int i = 0; i < q.length; i++) {
            q[i] = sc.nextInt();
        }
        int c = 0, d = 0, k = 0;
        /*for (int i : p) {
            r[c++] = i;
        }
        for (int i : q) {
            r[c++] = i;
        }*/
        while ((c < p.length) && (d < q.length)) {
            if (p[c] < q[d]) {
                r[k++] = p[c++];
            }
            else {
                r[k++] = q[d++];
            }
        }
        while (c < p.length) {
            r[k++] = p[c++];
        }
        while (d < q.length) {
            r[k++] = q[d++];
        }
        System.out.print("Resultant array:");
        System.out.print(Arrays.toString(r));
        sc.close();
    }
}