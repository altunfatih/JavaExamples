public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Fatih");
        myStack.push("Rolex");
        myStack.push("BMW");

        myStack.stackPrint();

        myStack.pop();
        myStack.stackPrint();
    }
}
