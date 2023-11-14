package csci2320.collections;

import java.util.function.Predicate;

public interface ImmutableLinkedList<E> {
    E head();
    ImmutableLinkedList<E> tail();
    ImmutableLinkedList<E> cons(E elem);
    E get(int index);
    int size();
    boolean isEmpty();
    ImmutableLinkedList<E> filter(Predicate<E> p);

    public static record Nil<E>() implements ImmutableLinkedList<E> {
        @Override
        public E head() {
            throw new UnsupportedOperationException("Can't call head on empty list");
        }
        @Override
        public ImmutableLinkedList<E> tail() {
            throw new UnsupportedOperationException("Can't call tail on empty list");
        }
        @Override
        public ImmutableLinkedList<E> cons(E elem) {
            return new Cons<E>(elem, this);
        }
        @Override
        public E get(int index) {
            throw new UnsupportedOperationException("Can't call get on Nil");
        }
        @Override
        public int size() {
            return 0;
        }
        @Override
        public ImmutableLinkedList<E> filter(Predicate<E> p) {
            return this;
        }
        @Override
        public boolean isEmpty() {
            return true;
        }
    }
    public static record Cons<E>(E elem, ImmutableLinkedList<E> next) implements ImmutableLinkedList<E> {

        @Override
        public E head() {
            return elem;
        }

        @Override
        public ImmutableLinkedList<E> tail() {
            return next;
        }

        @Override
        public ImmutableLinkedList<E> cons(E elem) {
            return new Cons<E>(elem, this);
        }

        @Override
        public E get(int index) {
            if(index == 0) {
                return elem;
            } else {
                return next.get(index - 1);
            }
        }

        @Override
        public int size() {
            return 1 + next.size();
        }

        @Override
        public ImmutableLinkedList<E> filter(Predicate<E> p) {
            if(p.test(elem)) {
                return new Cons<E>(elem, next.filter(p));
            } else {
                return next.filter(p);
            }
        }
        @Override
        public boolean isEmpty() {
            return false;
        }
    }
}
