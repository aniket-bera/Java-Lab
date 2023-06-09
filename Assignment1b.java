import java.util.Scanner;
class Assignment1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        float area = (3.14f * (r * r));
        float perimeter = 2 * 3.14f * r;
        System.out.println("Area of circle: "+area);
        System.out.print("Perimeter of circle: "+perimeter);
        sc.close();
    }
}