import java.util.Scanner;
class Assignment8c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email-ID: ");
        String str = sc.next();
        String [] temp = str.split("[@.]");
        System.out.println(temp[temp.length-2]);
    }
}