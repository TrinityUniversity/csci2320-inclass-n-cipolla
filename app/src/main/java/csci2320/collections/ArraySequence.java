package csci2320.collections;

public class ArraySequence<E> implements Seq<E> {

    @SuppressWarnings("unchecked") 
    private E[] data = (E[]) new Object[10];
    private int numElems = 0;

    @Override
    public E get(int index) {
        if (index < 0 || index >= numElems) 
            throw new IndexOutOfBoundsException("Get at " + index + " of " + numElems);
        return data[index];
    }

    @Override
    public void set(int index, E elem) {
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(E elem) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void insert(int index, E elem) {
        if (index < 0 || index > numElems) 
            throw new IndexOutOfBoundsException("Insert at " + index + " of " + numElems);
        if (numElems >= data.length) {
            @SuppressWarnings("unchecked")
            E[] tmp = (E[]) new Object[data.length * 2];

            //the for loop to copy the array over and increase the size
            for (int i=0; i<data.length; ++i) {
                tmp[i] = data[i];
                data = tmp;
            }
        }
            for (int i = numElems; i > index; --i) {
            data[i]= data[i-1];
        }
        data[index]=elem;
        numElems++;
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        if(numElems == 0) return true;
        else return false;
    }    
}
