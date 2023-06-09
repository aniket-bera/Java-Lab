import java.util.*;
class Search {
    int linearS (int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return (i + 1);
            }
        }
        return -1;
    }
    int binaryS (int[] a, int k) {
        int lb = 0;
        int ub = a.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (k == a[mid]) {
                return (mid + 1);
            }
            else if (k < a[mid]) {
                ub = mid - 1;
            }
            else {
                lb = mid + 1;
            }
        }
        return -1;
    }
}
class Assignment6d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search sh = new Search();
        System.out.print("Enter no. of element: ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter searching element: ");
        int x = sc.nextInt();
        while (true) {
            System.out.println("1 --> Linear Search");
            System.out.println("2 --> Binary Search");
            System.out.println("3 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: int p = sh.linearS(arr, x);
                        if (p == -1) {
                            System.out.println(x+""+" not found!");
                        }
                        else {
                            System.out.println(x+""+" found at "+p);
                        }
                break;
                case 2: int q = sh.binaryS(arr, x);
                        if (q == -1) {
                            System.out.println(x+""+" not found!");
                        }
                        else {
                            System.out.println(x+""+" found at "+q);
                        }
                break;
                case 3: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}