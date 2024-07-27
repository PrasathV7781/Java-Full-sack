import java.util.Scanner;
import java.util.Stack;

public class IntegerStackManager {
    private Stack<Integer> stack;

    public IntegerStackManager() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.push(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop an element.");
        } else {
            int value = stack.pop();
            System.out.println("Popped " + value + " from the stack.");
        }
    }

    // Method to check if the stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }

    public static void main(String[] args) {
        IntegerStackManager stackManager = new IntegerStackManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push element onto the stack");
            System.out.println("2. Pop element from the stack");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the integer to push onto the stack: ");
                    int valueToPush = scanner.nextInt();
                    stackManager.push(valueToPush);
                    break;

                case 2:
                    stackManager.pop();
                    break;

                case 3:
                    stackManager.checkIfEmpty();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
