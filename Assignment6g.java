import java.util.Scanner;
class CircularQueue {
    int[] arr = new int[20];
    int front = -1, rear = -1;
    void enque (int k, int cap) {
        if ((rear + 1) % cap == front) {
            System.out.println("Overflow");
        }
        else if (front == -1 && rear == -1) {
            System.out.println("ENQUE "+k);
            front = rear = 0;
            arr[rear] = k;
        }
        else {
            System.out.println("ENQUE "+k);
            rear = (rear + 1) % cap;
            arr[rear] = k;
        }
    }
    void deque (int cap) {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        }
        else if (front == rear) {
            System.out.println("DEQUE " + arr[front]);
            front = rear = -1;
        }
        else {
            System.out.println("DEQUE " + arr[front]);
            front = (front + 1) % cap;
        }
    }
    void display (int cap) {
        int i = front;
        if (front == -1 && rear == -1) {
            System.out.println("Circular Queue is empty");
        }
        else {
            System.out.print("Element of Circular Queue:");
            while (i != rear) {
                System.out.print(" "+arr[i]);
                i = (i + 1) % cap;
            }
            System.out.print(" "+arr[rear]);
        }
    }
}
class Assignment6g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue cq = new CircularQueue();
        System.out.print("Enter size of Circular Queue: ");
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
                    cq.enque(e, n);
                    break;
                case 2: cq.deque(n);
                    break;
                case 3: cq.display(n);
                    break;
                case 4: System.exit(0);
                default:System.out.println("Invalid choice!!!");
            }
        }
    }
}