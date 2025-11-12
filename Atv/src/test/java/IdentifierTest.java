import org.example.Identifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IdentifierTest {


    @Test
    void testValidIdentifiers() {
        Identifier id = new Identifier();
        assertTrue(id.validateIdentifier("abcde"));
        assertTrue(id.validateIdentifier("a1234"));
    }

    @Test
    void testInvalidIdentifiers() {
        Identifier id = new Identifier();
        assertFalse(id.validateIdentifier("123456"));
        assertFalse(id.validateIdentifier("abcdefg"));
    }
}
