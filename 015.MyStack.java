import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public int listSize() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Object print() {
        return stack.get(listSize() - 1);
    }

    public Object pop() {
        Object returnNumber = stack.get(listSize() - 1);
        stack.remove(listSize() - 1);
        return returnNumber;
    }

    public void push(Object add) {
        stack.add(add);
    }

    public void stackPrint() {
        System.out.println("--------------Yığın İçerigi ---------------------------");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(i + ". indekste: " + stack.get(i));
        }
    }
}
