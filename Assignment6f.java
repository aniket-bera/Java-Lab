import java.util.Scanner;
class Queue {
    int[] arr = new int[20];
    int front = -1, rear = -1;
    void enque (int k, int cap) {
        if (rear == cap - 1) {
            System.out.println("Overflow");
        }
        else if (front == -1 && rear == -1) {
            System.out.println("ENQUE "+k);
            front = rear = 0;
            arr[rear] = k;
        }
        else {
            System.out.println("ENQUE "+k);
            arr[++rear] = k;
        }
    }
    void deque () {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        }
        else if (front == rear) {
            front = rear = -1;
        }
        else {
            System.out.println("DEQUE " + arr[front]);
            front++;
        }
    }
    void display () {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.print("Element of Queue:");
            for (int i = front; i <= rear; i++) {
                System.out.print(" "+arr[i]);
            }
        }
    }
}
class Assignment6f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue que = new Queue();
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        while (true) {
            System.out.println("\n1 --> ENQUE");
            System.out.println("2 --> DEQUE");
            System.out.println("3 --> Display");
            System.out.println("4 --> Exit");
            System.out.print("Enter your choice: ");
            int ch =  sc.nextInt();
            switch (ch) {
                case 1: System.out.print("ENQUE: ");
                        int e = sc.nextInt();
                        que.enque(e, n);
                break;
                case 2: que.deque();
                break;
                case 3: que.display();
                break;
                case 4: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}