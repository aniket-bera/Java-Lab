import java.util.Scanner;
abstract class GeometricObject {
    String color;
    double weight;
    GeometricObject () {
        color = "White";
        weight = 1.0;
    }
    String getColor () {
        return color;
    }
    double getWeight () {
        return weight;
    }
    abstract double findArea (double [] s);
    abstract double findCircumference (double [] s);
}
class Triangle2 extends GeometricObject {
    double findArea (double [] s) {
        double p = (s[0] + s[1] + s[2]) / 2;
        return (Math.sqrt((p * (p-s[0]) * (p-s[1]) * (p-s[2]))));
    }
    double findCircumference(double [] s) {
        return (s[0] + s[1] + s[2]);
    }
}
class Assignment9d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of Triangle:");
        double [] s = new double[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.nextDouble();
        }
        GeometricObject t = new Triangle2();
        System.out.println("Color of Triangle: "+t.getColor());
        System.out.println("Weight of Triangle: "+t.getWeight());
        System.out.println("Area of Triangle: "+t.findArea(s));
        System.out.println("Circumference of Triangle: "+t.findCircumference(s));
    }
}