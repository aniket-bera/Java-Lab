import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String mystr = sc.nextLine();
        System.out.println("The string you entered: "+mystr);
        int myclass;
        float percentage;
        System.out.print("Enter your semester: ");
        myclass = sc.nextInt();
        System.out.print("Enter your percentage: ");
        percentage = sc.nextFloat();
        System.out.println("Name: "+mystr);
        System.out.println("Semester: "+myclass);
        System.out.println("Percentage: "+percentage);
        sc.close();
    }
}
