import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myInt = sc.nextInt();
        System.out.println("Your number is "+myInt);
        System.out.println(" ");
        for (int i = 1; i <= 11; i++) {
            System.out.println(i+" x "+myInt+" = "+(i*myInt));
        }
        sc.close();
    }
}
