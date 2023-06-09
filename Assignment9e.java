abstract class Shape {
    double a = 10, b = 5;
    abstract double printArea ();
}
class RectangleShape extends Shape {
    double printArea () {
        return (a * b);
    }
}
class TriangleShape extends Shape {
    double printArea () {
        return (0.5 * a * b);
    }
}
class CircleShape extends Shape {
    double printArea () {
        return (Math.PI * Math.pow(b, 2));
    }
}
class Assignment9e {
    public static void main(String[] args) {
        Shape rs = new RectangleShape();
        Shape ts = new TriangleShape();
        Shape cs = new CircleShape();
        System.out.println("Area of Rectangle: "+rs.printArea());
        System.out.println("Area of Triangle: "+ts.printArea());
        System.out.println("Area of Circle: "+cs.printArea());
    }
}