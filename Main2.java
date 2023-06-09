import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("The subjects are as follows:");
        String input = "1 Math 2 Science 3 English 4 Hindi";
        Scanner s = new Scanner(input);
        System.out.print(s.nextInt()+". ");
        System.out.println(s.next());
        System.out.print(s.nextInt()+". ");
        System.out.println(s.next());
        System.out.print(s.nextInt()+". ");
        System.out.println(s.next());
        System.out.print(s.nextInt()+". ");
        System.out.println(s.next());
        s.close();
    }
}
