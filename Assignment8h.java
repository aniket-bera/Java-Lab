import java.util.Scanner;
class Assignment8h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.println("Middle word: "+str.substring(((str.length() - 3) / 2), (((str.length() - 3) / 2)+3)));
        System.out.print("String 1: ");
        String str1 = sc.next();
        System.out.print("String 2: ");
        String str2 = sc.next();
        System.out.println("After appending: "+(str1.substring(0, (str1.length() / 2)) + str2 + str1.substring(str1.length() / 2)));
    }
}