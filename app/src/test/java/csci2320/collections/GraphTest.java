package csci2320.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GraphTest {
    @Test void smallGraphNoCyles() {
        List<List<Integer>> graph = List.of(List.of(1,2),
                                            List.of(2),
                                            List.of(3),
                                            List.of()
        );
        var dist = graph.recursiveDFSShort(0,graph,3);
        assertEquals(2,dist,"Wrong distance on simple graph with no cycles");
    }

    @Test void smallGraphCycles() {

    }
}
