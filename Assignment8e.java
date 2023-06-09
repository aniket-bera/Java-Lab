import java.util.Scanner;
class HAscii {
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
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
//                    temp[j] = temp[j] ^ temp[j + 1] ^ (temp[j + 1] = temp[j]);
                    String t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }
        System.out.print("Highest ASCII value wise name: "+s[s.length-1]);
    }
}
class Assignment8e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of name: ");
        int n = sc.nextInt();
        String [] name = new String[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }
        HAscii ha = new HAscii();
        ha.potSort(name);
    }
}