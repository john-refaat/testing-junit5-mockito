package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created By john on Aug, 2019
 **/

public class InlineMockTest {
    @Test
    void inlineMock() {
        Map inlineMock = mock(Map.class);
        assertEquals(0, inlineMock.size());
    }
}
