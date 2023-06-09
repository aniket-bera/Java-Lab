import java.util.Scanner;
class ThreadA extends Thread {
    int sum;
    void add (int c, int d) {
        try {
            Thread.sleep(500);
            sum = c + d;
        }
        catch (Exception e) {
            System.out.println("Exception occur");
        }
        finally {
            System.out.println("After Adding in Thread A:\nSum: "+sum);
        }
    }
}
class ThreadB extends Thread{
    void increase(int c, int d) {
        try {
            c += 5;
            d += 5;
            Thread.sleep(500);
        }
        catch (Exception e) {
            System.out.println("Exception occur");
        }
        finally {
            System.out.println("After Increasing in Thread B:\na = "+c+"\nb = "+d);
        }
    }
}
class Assignment11b {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        ThreadA obj1 = new ThreadA();
        new Thread(obj1);
        obj1.add(a, b);
        ThreadB obj2 = new ThreadB();
        new Thread(obj2);
        obj2.increase(a, b);
    }
}