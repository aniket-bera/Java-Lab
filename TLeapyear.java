import java.util.Scanner;
class TLeapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();
        String r = ((y % 4 == 0 && y % 100 != 0) ? "is a Leap Year" : (y % 400 == 0) ? "is a Leap Year" : "isn't a Leap Year");
        System.out.print(y+" "+r);
        sc.close();
    }
}