public class Stack_Array {
    int[] container;
    int top = 0;
    private static final int CAPACITY = 10;
    public Stack_Array(int size) {
        container = new int[size];
    }
    public Stack_Array() {
        container = new int[CAPACITY];
    }
    public boolean push(int element) {

        if (top == container.length) {
            grow();
            return false;
        }
        container[top] = element;
        top++;
        return true;
    }
    public int pop() {

        if (isEmpty()) {
            return 0;
        }
        top--;
        return container[top];
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public void grow() {
        int[] newContainer = new int[container.length + CAPACITY];
        System.arraycopy(container, 0, newContainer, 0, container.length);
        container = newContainer;
    }
    public int peak() {

        if (isEmpty()) {
            return 0;

        }
        return container[top - 1];
    }
    public int size() {
        return top;
    }
    public void clear() {
        top = 0;
    }
    public Stack_Array copy() {
        Stack_Array newStack = new Stack_Array(this.container.length);
        for (int i = 0; i < top; i++) {
            newStack.container[i] = container[i];
        }
        newStack.top = top;
        return newStack;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty Stack !");
        }
        System.out.println("Stack Elements:");
        for(int i = top ; i > -1 ; i--){
            System.out.println(container[i]);
        }
    }
}
