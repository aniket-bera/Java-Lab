import java.util.Scanner;
class Assignment2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        System.out.println("A: "+a+"\nB: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping without 3rd variable:\nA: "+a+"\nB: "+b);
        System.out.print("Enter value of C: ");
        int c = sc.nextInt();
        System.out.print("Enter value of D: ");
        int d = sc.nextInt();
        System.out.println("C: "+c+"\nD: "+d);
        int temp = c;
        c = d;
        d = temp;
        System.out.println("After Swapping using 3rd variable:\nC: "+c+"\nD: "+d);
        sc.close();
    }
}
