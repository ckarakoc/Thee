import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {

    @Test
    void alwaysTrue() {
        assertTrue(true);
    }

    @Test
    void alwaysFalse() {
        assertFalse(false);
    }
}
