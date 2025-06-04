package CoreJava.CollectionFrameworkLookup.ListInterface;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        // Create a new Stack of Strings
        Stack<String> st = new Stack<>();

        // push(E item): Pushes an item onto the top of the stack.
        st.push("RCB");
        st.push("Won");
        st.push("Trophy");

        System.out.println("Initial Stack: " + st);

        // pop(): Removes the object at the top of the stack and returns that object.
        String poppedElement = st.pop();
        System.out.println("After pop(): " + st);
        System.out.println("Popped Element: " + poppedElement);

        // peek(): Looks at the object at the top of the stack without removing it.
        String topElement = st.peek();
        System.out.println("After peek(): " + st);
        System.out.println("Top Element: " + topElement);

        // empty(): Tests if the stack is empty.
        boolean isEmpty = st.empty();
        System.out.println("Is stack empty? " + isEmpty);

        // search(Object o): Returns the 1-based position from the top of the stack.
        int position = st.search("RCB");
        System.out.println("Position of 'RCB' from top: " + position);

        // size(): Returns the number of elements in the stack.
        int size = st.size();
        System.out.println("Size of stack: " + size);

        // contains(Object o): Checks if the stack contains the specified element.
        boolean containsRCB = st.contains("RCB");
        System.out.println("Stack contains 'RCB'? " + containsRCB);

        // isEmpty(): Another way to check if the stack is empty.
        System.out.println("Is stack empty? " + st.isEmpty());

        // clear(): Removes all elements from the stack.
        st.clear();
        System.out.println("Stack after clear(): " + st);
    }
}
