import java.util.Scanner;
class Employee {
    String eId, eName, eCity;
    double eBasic;
    void takeDetails () {
        Scanner scS = new Scanner(System.in);
        Scanner scSS = new Scanner(System.in);
        Scanner scI = new Scanner(System.in);
        System.out.print("Enter EID: ");
        eId = scS.next();
        System.out.print("Enter employee name: ");
        eName = scSS.nextLine();
        System.out.print("Enter employee basic: ");
        eBasic = scI.nextDouble();
        System.out.print("Enter employee city: ");
        eCity = scSS.nextLine();
    }
    void showDetails () {
        System.out.println("EID: "+eId+"\nEMP Name: "+eName+"\nEMP Basic: "+eBasic+"\nEMP City: "+eCity);
    }
    double Salary () {
        return eBasic;
    }
}
class Company1 extends Employee {
     double Salary () {
        double agp = super.Salary() * 0.4;
        double mb = eBasic + agp;
        double da = mb * 0.25;
        double hra = mb * 0.1;
        return (agp + mb + da + hra);
    }
}
class Company2 extends Employee {
    double Salary () {
        double agp = super.Salary() * 0.5;
        double mb = eBasic + agp;
        double da = mb * 0.5;
        double hra = mb * 0.15;
        return (agp + mb + da + hra);
    }
}
class Assignment9a {
    public static void main(String[] args) {
        Employee cmp1 = new Company1();
        Employee cmp2 = new Company2();
        cmp1.takeDetails();
        cmp1.showDetails();
        System.out.println("Company1 Salary: "+cmp1.Salary());
        cmp2.takeDetails();
        cmp2.showDetails();
        System.out.println("Company2 Salary: "+cmp2.Salary());
    }
}