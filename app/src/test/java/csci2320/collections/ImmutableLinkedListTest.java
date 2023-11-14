package csci2320.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImmutableLinkedListTest {
    @Test public void basicTests() {
        ImmutableLinkedList<Integer> nil = new ImmutableLinkedList.Nil<Integer>();
        assertTrue(nil.isEmpty());
        assertEquals(0,nil.size());
        var lst = nil.cons(3).cons(2).cons(1);
        assertEquals(3,lst.size());
        assertEquals(1,lst.head());
        assertEquals(3, lst.get(2));        
    }
}
