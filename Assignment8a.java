import java.util.Scanner;
class Upper {
    void upc (String [] s) {
        String ns = "";
        for (String i : s) {
            String fl = i.substring(0, 1);
            String rl = i.substring(1);
            ns += fl.toUpperCase() + rl + " ";
        }
        System.out.println(ns.trim());
    }
}
class CountVC {
    void vc (String [] s) {
        String [] temp = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            int vow = 0, con = 0;
            temp[i] = s[i].toUpperCase();
            for (int j = 0; j < s[i].length(); j++) {
                if (temp[i].charAt(j)=='A'||temp[i].charAt(j)=='E'||temp[i].charAt(j)=='I'||temp[i].charAt(j)=='O'||temp[i].charAt(j)=='U') {
                    vow++;
                }
                else if (temp[i].charAt(j)>='A' && temp[i].charAt(j)<='Z') {
                    con++;
                }
            }
            System.out.println(s[i]+": Vowels = "+vow+" Consonants = "+con);
        }
    }
}
class Assignment8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String [] str1 = str.split(" ");
        Upper up = new Upper();
        up.upc(str1);
        CountVC cvc = new CountVC();
        cvc.vc(str1);
    }
}