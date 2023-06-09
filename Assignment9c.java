abstract class TwoDFigure {
    double h = 10, b = 5;
    abstract double calculateArea ();
}
class Rectangle extends TwoDFigure {
    double calculateArea () {
        return (h * b);
    }
}
class Triangle extends TwoDFigure {
    double calculateArea () {
        return (0.5 * h * b);
    }
}
class Assignment9c {
    public static void main(String[] args) {
        TwoDFigure r = new Rectangle();
        TwoDFigure t = new Triangle();
        System.out.println("Rectangle area: "+r.calculateArea());
        System.out.println("Triangle area: "+t.calculateArea());
    }
}