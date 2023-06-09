import java.util.Scanner;
class Assignment2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        double bp = sc.nextDouble();
        double agp = bp * .5;
        double da = (bp + agp) * .5;
        double hra = (bp + agp) * .15;
        double ts = bp + agp + da + hra;
        System.out.print("Total Salary: "+ts);
        sc.close();
    }
}