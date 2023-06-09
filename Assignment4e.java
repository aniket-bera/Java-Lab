import java.util.Scanner;
class Assignment4e {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int s =  sc.nextInt();
        System.out.print("Enter ending no.: ");
        int e = sc.nextInt();
        int sum = 0;
        //System.out.print("Magic numbers from "+s+" to "+e+" are:");
        System.out.print("Composite Magic numbers from "+s+" to "+e+" are:");
        for (int i = s; i <= e; i++) {
            int temp = i;
            while (temp > 9){
                while (temp > 0){
                    int rem = temp % 10;
                    sum += rem;
                    temp /= 10;
                }
                temp = sum;
                sum = 0;
            }
            if (temp == 1){
                //System.out.print(" "+i);
                int count = 0;
                for (int j = 2; j <= (i/2); j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count != 0){
                    System.out.print(" "+i);
                }
            }
        }
        sc.close();
    }
}
