class Typewrap {
    public static void main(String[] args) {
        System.out.println("Variable created");
        int i = 1234;
        char c = 'x';
        byte b = 50;
        short s = 1994;
        long l = 123456789l;
        float f1 = 3.142f;
        double d = 0.00007;
        System.out.println("i = "+i);
        System.out.println("c = "+c);
        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("l = "+l);
        System.out.println("f1 = "+f1);
        System.out.println("d = "+d);
        System.out.println("Type converted");
        System.out.println("(short) b = "+(short) b);
        System.out.println("(short) i = "+(short) i);
        System.out.println("(float) f1 = "+(float) f1);
        System.out.print("(int) f1 = "+(int) f1);
    }
}
