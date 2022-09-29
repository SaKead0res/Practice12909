import org.example.classes.StringHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {

    @Test
    @DisplayName("Reverse String Test")
    void reverseTest(){
        assertEquals("cba", StringHelper.reverse("abc"));
    }

}
