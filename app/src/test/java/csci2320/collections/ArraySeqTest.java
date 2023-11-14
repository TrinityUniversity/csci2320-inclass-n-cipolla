package csci2320.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySeqTest {
    @Test public void insert() {
        ArraySequence<Integer> seq = new ArraySequence<>();
        seq.insert(0,7);
        assertEquals(7,seq.get(0));
    }
}
