import java.util.Scanner;
class MathException extends Exception {
    MathException (String msg) {
        super(msg);
    }
}
class OverflowException extends MathException {
    OverflowException () {
        super("OverflowException");
    }
}
class UnderflowException extends MathException {
    UnderflowException () {
        super("UnderflowException");
    }
}
class Assignment10d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int a = sc.nextInt();
        try {
            try {
                if (a > 100) {
                    throw new OverflowException();
                }
                else {
                    throw new UnderflowException();
                }
            }
            catch (OverflowException e1) {
                throw e1;
            }
            catch (UnderflowException e2) {
                throw e2;
            }
        }
        catch (MathException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Exception has been occur");
        }
    }
}