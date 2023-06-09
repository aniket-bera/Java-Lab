import java.util.*;
class Sort {
    void bSort (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] ^ a[j + 1] ^ (a[j + 1] = a[j]);
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
    void sSort (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min  = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                a[i] = a[i] ^ a[min] ^ (a[min] = a[i]);
            }
        }
    }
    void iSort (int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
class Assignment6c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort st =  new Sort();
        System.out.print("Enter no. of element: ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Initial elements are: ");
        System.out.println(Arrays.toString(arr));
        while (true) {
            System.out.println("1 --> Bubble Sort");
            System.out.println("2 --> Selection Sort");
            System.out.println("3 --> Insertion Sort");
            System.out.println("4 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: st.bSort(arr);
                        System.out.print("Sorted elements are: ");
                        System.out.println(Arrays.toString(arr));
                break;
                case 2: st.sSort(arr);
                        System.out.print("Sorted elements are: ");
                        System.out.println(Arrays.toString(arr));
                break;
                case 3: st.iSort(arr);
                        System.out.print("Sorted elements are: ");
                        System.out.println(Arrays.toString(arr));
                break;
                case 4: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}