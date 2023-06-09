import java.util.Scanner;
class Assignment4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int s =  sc.nextInt();
        System.out.print("Enter ending no.: ");
        int e = sc.nextInt();
        System.out.print("Prime numbers from "+s+" to "+e+" are:");
        for (int i = s; i <= e; i++) {
            int count = 0;
            for (int j = 2; j <= (i/2); j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i > 1){
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}