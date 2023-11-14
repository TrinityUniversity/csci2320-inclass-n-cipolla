package csci2320.collections;

public class LinkedStack<E> implements Stack<E> {
    public static class Node<E> {
        E value;
        Node<E> next;
        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node<E> top = null;

    @Override
    public void push(E elem) {
        top = new Node<E>(elem,top);
    }

    @Override
    public E pop() {
        var ret = top.value;
        top = top.next;
        return ret;
    }

    @Override
    public E peek() {
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
}
