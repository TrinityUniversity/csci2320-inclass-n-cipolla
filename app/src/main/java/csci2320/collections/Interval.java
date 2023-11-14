package csci2320.collections;

public record Interval<E extends Comparable<E>>(E min, E max) {
    public boolean overlaps(Interval<E> that) {
        //TODO
        return false; 
    }
}
