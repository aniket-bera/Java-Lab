import java.util.Scanner;
class SortPotential {
    int checkAscii (String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            a += (int)s.charAt(i) - 64;
        }
        return a;
    }
    void potSort (String [] s) {
        int [] temp = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            int sum = 0;
            for (int j = 0; j < s[i].length(); j++) {
                sum += checkAscii(String.valueOf(s[i].charAt(j)));
            }
            temp[i] = sum;
        }
        System.out.println("POTENTIAL:");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]+" = "+temp[i]);
        }
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    temp[j] = temp[j] ^ temp[j + 1] ^ (temp[j + 1] = temp[j]);
                    String t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }
        for (String i : s) {
            System.out.print(i+" ");
        }
    }
}
class Assignment8d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence separated by space:");
        String str = sc.nextLine();
        String [] temp = str.split(" ");
        SortPotential sp = new SortPotential();
        sp.potSort(temp);
    }
}