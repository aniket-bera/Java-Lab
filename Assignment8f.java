import java.util.Scanner;
class RemChar {
    void remove (String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print(s.charAt(i));
            }
            else {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    continue;
                }
                System.out.print(s.charAt(i));
            }
        }
    }
}
class Assignment8f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        RemChar rc = new RemChar();
        rc.remove(str);
    }
}