package gr.aueb.cf.ch6;

/**
 * LIFO (Last In First Out)
 */
public class Array23StackApp8 {

    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        num = pop();
        traverseStack();
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return myStack[top--];
//        int elementToReturn = myStack[top];
//        top--;
//        return elementToReturn;
    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        myStack[top] = num;
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static boolean isFull() {
        return (top == myStack.length - 1);
    }

    public static void traverseStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(myStack[i] + " ");
        }
        System.out.println();
    }
}

