package csci2320.collections;

public interface Seq<E> {
    E get(int index);
    void set(int index, E elem);
    void add(E elem);
    void insert (int index, E elem);
    E remove (int index);
    int size();
    boolean isEmpty(); 
}
