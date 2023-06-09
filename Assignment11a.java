class Thread1 extends Thread {
    public synchronized void run () {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: "+i);
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("Exception occur");
        }
    }
}
class Thread2 extends Thread {
    public void run () {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread 2: "+i);
            try {
                if (i == 6) {
                    Thread.sleep(10000);
                }
            }
            catch (Exception e) {
                System.out.println("Exception occur");
            }
        }
    }
}
class Assignment11a {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}