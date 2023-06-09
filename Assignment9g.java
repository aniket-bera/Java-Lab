interface MeanInterface {
    void mean (double [] k);
}
class Deviation implements MeanInterface {
    public void mean (double [] k) {
        double temp = 0;
        for (double i : k) {
            temp += i;
        }
        temp /= k.length;
        for (double i : k) {
            double d = i - temp;
            System.out.print(" " + d);
        }
    }
}
class Assignment9g {
    public static void main(String[] args) {
        double [] values = {34, 75, 89, 23, 66};
        MeanInterface obj = new Deviation();
        System.out.print("Deviation:");
        obj.mean(values);
    }
}