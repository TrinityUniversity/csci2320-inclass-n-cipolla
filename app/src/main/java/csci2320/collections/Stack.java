package csci2320.collections;

public interface Stack<E> {
    void push (E elem);
    E pop();
    E peek();
    boolean isEmpty();

    //Exception handling
    static class StackUnderflowException extends RuntimeException {
        public StackUnderflowException(String message) {
            super(message);
        }
    }
    
}
