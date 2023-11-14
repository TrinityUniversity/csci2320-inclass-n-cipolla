package csci2320.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderedSetTest {
    @Test void addContainsTest() {
        var set = new OrderedSet<Integer>();
        assertTrue(set.add(5));
        assertTrue(set.add(2));
        assertTrue(set.add(6));
        assertTrue(set.add(1));
        assertTrue(set.add(4));
        assertTrue(set.add(3));
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertFalse(set.add(6));
        assertTrue(set.contains(5));
        assertFalse(set.contains(9));
    }

    @Test void subrange() {
        var set = new OrderedSet<Integer>();
        assertTrue(set.add(5));
        assertTrue(set.add(2));
        assertTrue(set.add(6));
        assertTrue(set.add(1));
        assertTrue(set.add(3));
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertFalse(set.add(6));
        assertTrue(set.add(-4));
        System.out.println(set.toStringPreorder());
        System.out.println(set.toStringPostorder());
        System.out.println(set.toStringInorder());
        var subset = set.subsetBetween(4,6);
        assertTrue(subset.contains(5));
        assertTrue(subset.contains(6));
        assertFalse(subset.contains(7));
        assertFalse(subset.contains(4));

        var subset2 = set.subsetBetween(7,9);
        assertTrue(subset2.contains(7));
        assertTrue(subset2.contains(8));
        assertFalse(subset2.contains(9));
        assertFalse(subset2.contains(5));
        assertFalse(subset2.contains(4));
    }


}
