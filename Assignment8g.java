import java.util.Scanner;
class CheckBracket {
    boolean wellbracketed (String s) {
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')') {
                depth--;
                break;
            }
            else if (s.charAt(i) == '(') {
                depth++;
            }
            else if (s.charAt(i) == ')') {
                depth--;
            }
        }
        if (depth > 0) {
            return false;
        }
        else if (depth == 0) {
            return true;
        }
        return false;
    }
}
class Assignment8g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test case:");
        String str = sc.next();
        CheckBracket cb = new CheckBracket();
        System.out.print(cb.wellbracketed(str));
    }
}