import java.util.Scanner;
class SortAlpha {
    void sort (String [] s) {
        String temp;
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (s[i].compareTo(s[j])>0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < s.length; i++) {
            if (i < s.length-1) {
                System.out.print(s[i]+",");
            }
            else {
                System.out.print(s[i]);
            }
        }
    }
}
class Assignment8b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma-separated sequence of word:");
        String str = sc.next();
        String [] str1 = str.split(",");
        SortAlpha sa = new SortAlpha();
        sa.sort(str1);
    }
}