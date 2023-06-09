import java.util.Scanner;
class Name {
    String fn, mn, ln;
    Name (String fn, String mn, String ln) {
        this.fn = fn;
        this.mn = mn;
        this.ln = ln;
    }
    String fullN () {
        return (fn+" "+mn+" "+ln);
    }
}
class DOB {
    String bd, bm, by;
    DOB (String bd, String bm, String by) {
        this.bd = bd;
        this.bm = bm;
        this.by = by;
    }
    String dob () {
        return (bd+"-"+bm+"-"+by);
    }
}
class StuDetails {
    String sID, g;
    Name nm;
    DOB db;
    String[] sub = {"English", "Mathematics", "Computer Science"};
    double[] mk = new double[3];
    StuDetails () {}
    StuDetails (String sID, Name nm, DOB db, String g, double [] mk) {
        this.sID = sID;
        this.nm = nm;
        this.db = db;
        this.g = g;
        this.mk = mk;
    }
    void dis (StuDetails [] s, int i) {
        System.out.println("ID: "+s[i].sID);
        System.out.println("Name: "+s[i].nm.fullN());
        System.out.println("DOB: "+s[i].db.dob());
        System.out.println("Gender: "+s[i].g);
        System.out.println("Marks of 3 subjects:");
        for (int j = 0; j < 3; j++) {
            System.out.println(s[i].sub[j]+": "+s[i].mk[j]);
        }
        System.out.println("______________________");
    }
    void tDetails (StuDetails [] s) {
        for (int i = 0; i < s.length; i++) {
            dis(s, i);
        }
    }
    void fbn (StuDetails [] s, String [] f) {
        int i = 0, flag = 0;
        for (; i < s.length; i++) {
            if (s[i].nm.mn.isEmpty()) {
                if (s[i].nm.fn.equalsIgnoreCase(f[0]) &&
                        s[i].nm.ln.equalsIgnoreCase(f[1])) {
                    flag = 1;
                    break;
                }
            }
            else {
                if (s[i].nm.fn.equalsIgnoreCase(f[0]) &&
                        s[i].nm.mn.equalsIgnoreCase(f[1]) &&
                        s[i].nm.ln.equalsIgnoreCase(f[2])) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Invalid Name!!!");
        }
        else {
            dis(s, i);
        }
    }
    void fbi (StuDetails [] s, String f) {
        int i = 0, flag = 0;
        for (; i < s.length; i++) {
            if (f.equals(s[i].sID)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Invalid ID!!!");
        }
        else {
            dis(s, i);
        }
    }
}
class Assignment7d {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        StuDetails std = new StuDetails();
        String ftn, mdn, ltn;
        System.out.print("Enter no. of student: ");
        int ns = sc.nextInt();
        StuDetails [] st = new StuDetails[ns];
        for (int i = 0; i < ns; i++) {
            System.out.print("Student ID: ");
            String sID = sc1.next();
            System.out.print("First Name: ");
            ftn = sc2.nextLine();
            System.out.print("Middle Name: ");
            mdn = sc2.nextLine();
            System.out.print("Last Name: ");
            ltn = sc2.nextLine();
            Name nm = new Name(ftn, mdn, ltn);
            System.out.print("Birth Date: ");
            String bd = sc.next();
            System.out.print("Birth Month: ");
            String bm = sc.next();
            System.out.print("Birth Year: ");
            String by = sc.next();
            DOB d = new DOB(bd, bm, by);
            System.out.print("Gender: ");
            String g = sc1.next();
            System.out.println("Enter marks of 3 subjects:");
            double [] m = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print(std.sub[j]+": ");
                m[j] = sc1.nextDouble();
            }
            st[i] = new StuDetails(sID, nm, d, g, m);
        }
        std.tDetails(st);
        while (true) {
            System.out.println("1 --> Search by Name");
            System.out.println("2 --> Search by ID");
            System.out.println("3 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.print("Enter searching name: ");
                        String sn = sc2.nextLine();
                        String [] sn1 = sn.split(" ");
                        std.fbn(st, sn1);
                break;
                case 2: System.out.print("Enter searching ID: ");
                        String p = sc1.next();
                        std.fbi(st, p);
                break;
                case 3: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}