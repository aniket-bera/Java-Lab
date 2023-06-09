import java.util.Scanner;
class Assignment5c {
    static int fact (int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
    static int sp (int num) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            num /= 10;
            sum += fact(rem);
        }
        if (temp == sum) {
            num = sum;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int s =  sc.nextInt();
        System.out.print("Enter ending no.: ");
        int e = sc.nextInt();
        System.out.print("Special numbers from "+s+" to "+e+" are:");
        for (int i = s; i <= e; i++) {
            if (sp(i) == i) {
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}