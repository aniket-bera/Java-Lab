import java.util.Scanner;
class Stack {
    int[] arr = new int[20];
    int top = -1;
    void push (int k, int cap) {
        if (top >= cap - 1) {
            System.out.println("Overflow");
        }
        else {
            System.out.println("PUSH "+k);
            arr[++top] = k;
        }
    }
    void pop () {
        if (top <= -1) {
            System.out.println("Underflow");
        }
        else {
            System.out.println("POP "+arr[top]);
            top--;
        }
    }
    void display () {
        if (top >= 0) {
            System.out.print("Element of Stack:");
            for (int i = top; i >= 0; i--) {
                System.out.print(" "+arr[i]);
            }
        }
        else {
            System.out.println("Empty Stack");
        }
    }
}
class Assignment6e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();
        System.out.print("Enter size of Stack: ");
        int n = sc.nextInt();
        while (true) {
            System.out.println("1 --> PUSH");
            System.out.println("2 --> POP");
            System.out.println("3 --> Display");
            System.out.println("4 --> Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.print("PUSH: ");
                        int p = sc.nextInt();
                        stk.push(p, n);
                break;
                case 2: stk.pop();
                break;
                case 3: stk.display();
                break;
                case 4: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}