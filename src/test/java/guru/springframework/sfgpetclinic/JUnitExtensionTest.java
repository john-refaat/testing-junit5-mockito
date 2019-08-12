package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * Created By john on Aug, 2019
 **/

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    Map<String , Object> mapMock;

    @Test
    void testMock() {
        mapMock.put("foo" , "bar");
    }
}
