public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
    }

    public int pop(int element) {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int getTop() {
        return top;
    }
}
