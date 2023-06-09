import java.util.Scanner;
class Assignment3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        double detr = Math.pow(b, 2) - (4 * a * c);
        if(detr > 0){
            double r1 = (- b + Math.sqrt(detr)) / (2 * a);
            double r2 = (- b - Math.sqrt(detr)) / (2 * a);
            System.out.println("Two roots are real & distinct:");
            System.out.format("Root1 = %.2f\nRoot2 = %.2f",r1,r2);
        }
        else if (detr == 0) {
            double r = - b / (2 * a);
            System.out.println("Two roots are real & equal:");
            System.out.format("Root = %.2f",r);
        }
        else {
            double real = - b / (2 * a);
            double img = Math.sqrt(-detr) / (2 * a);
            System.out.println("Two roots are complex & distinct:");
            System.out.format("Root1 = %.2f + %.2fi\nRoot2 = %.2f - %.2fi",real,img,real,img);
        }
        sc.close();
    }
}