import java.util.Scanner;
class Arr1D {
    int max1d (int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    int min1d (int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
class Arr2D {
    int max2d (int[][] arr) {
        int max = arr[0][0];
        for (int [] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
    int min2d (int[][] arr) {
        int min = arr[0][0];
        for (int [] i : arr) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }
}
class Assignment6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 --> 1D Array");
            System.out.println("2 --> 2D Array");
            System.out.println("3 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.print("Enter no. of element: ");
                        int n1 = sc.nextInt();
                        int[] arr1d = new int[n1];
                        System.out.println("Enter "+n1+" element:");
                        for (int i = 0; i < arr1d.length; i++) {
                            arr1d[i] = sc.nextInt();
                        }
                        System.out.print("Elements are:");
                        for (int i : arr1d) {
                            System.out.print(" "+i);
                        }
                        Arr1D a1 = new Arr1D();
                        System.out.println("\nMin = "+a1.min1d(arr1d)+"\nMax = "+a1.max1d(arr1d));
                break;
                case 2: System.out.print("Enter no. of rows: ");
                        int r = sc.nextInt();
                        System.out.print("Enter no. of columns: ");
                        int c = sc.nextInt();
                        int[][] arr2d = new int[r][c];
                        System.out.println("Enter matrix row wise:");
                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                arr2d[i][j] = sc.nextInt();
                            }
                        }
                        System.out.println("Matrix["+r+"]["+c+"]:");
                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(arr2d[i][j]+" ");
                            }
                            System.out.println();
                        }
                        Arr2D a2 = new Arr2D();
                        System.out.println("\nMin = "+a2.min2d(arr2d)+"\nMax = "+a2.max2d(arr2d));
                break;
                case 3: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}