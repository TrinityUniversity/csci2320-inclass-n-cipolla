package csci2320.collections;

import java.util.Optional;

public class IntervalTree<E extends Comparable<E>> {
    private class Node<E extends Comparable<E>> {
        Interval<E> interval;
        E max;
        Node<E> left, right;
        //constructor goes here
    }

    Node<E> root = null;

    //Code that builds the trees

    public Optional<Interval<E>> operlappingInterval(Interval<E> interval) {
        Node<E> rover = root;
        while(rover != null && !rover.interval.overlaps(interval)) {
            if (interval.min().compareTo(rover.left.max) < 0) {
                rover = rover.left;
            } else {
                rover = rover.right;
            }
        }
        if (rover == null) return Optional.empty();
        else return Optional.of(rover.interval);
    }

}
