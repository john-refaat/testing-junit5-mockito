package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

/**
 * Created By john on Aug, 2019
 **/

public class AnnotationMocksTest {

    @Mock
    Map<String , Object> mapMock;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("key", "value");
    }
}
