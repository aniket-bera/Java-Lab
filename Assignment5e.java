import java.util.Scanner;
class Assignment5e {
    static boolean isPrime (int n) {
        int count = 0;
        for (int j = 2; j <= (n/2); j++) {
            if (n % j == 0) {
                count++;
                break;
            }
        }
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
    }
    static boolean checkCP (int k, int nod) {
        int div = (int)(Math.pow(10, nod - 1));
        int temp = k;
        int cp = 0;
        for (int j = 1; j <= nod; j++) {
            temp = ((temp % div) * 10) + (temp / div);
            if (isPrime(temp)) {
                cp++;
            }
        }
        if (cp == nod) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int s =  sc.nextInt();
        System.out.print("Enter ending no.: ");
        int e = sc.nextInt();
        System.out.print("Circular Prime numbers from "+s+" to "+e+" are:");
        for (int i = s; i <= e; i++) {
            int n = String.valueOf(i).length();
            if (checkCP(i, n)) {
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}