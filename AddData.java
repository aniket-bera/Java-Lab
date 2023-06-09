package MyPackage;
public class AddData implements AddMul{
    public double add (double a, double b) {
        return (a+b);
    }
    public int add (int a, int b) {
        return (a+b);
    }
    public String add(String a, String b) {
        return (a + b);
    }
    public int show (String s) {
        return s.length();
    }
}