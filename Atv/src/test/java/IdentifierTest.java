import org.example.Identifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IdentifierTest {


    Identifier id = new Identifier();

    @Test
    public void testIdentificadorVazio() {
        assertFalse(id.validateIdentifier(""));
    }

    @Test
    public void testPrimeiroCaractereInvalido() {
        assertFalse(id.validateIdentifier("1abc"));
    }

    @Test
    public void testCaractereInternoInvalido() {
        assertFalse(id.validateIdentifier("a$bc"));
    }

    @Test
    public void testTamanhoMaiorQuePermitido() {
        assertFalse(id.validateIdentifier("abc1234"));
    }

    @Test
    public void testTamanhoMinimo() {
        assertTrue(id.validateIdentifier("a"));
    }

    @Test
    public void testTamanhoMaximo() {
        assertTrue(id.validateIdentifier("abc123"));
    }

    @Test
    public void testIdentificadorValidoLetras() {
        assertTrue(id.validateIdentifier("abc"));
    }

    @Test
    public void testIdentificadorValidoComNumeros() {
        assertTrue(id.validateIdentifier("a1b2"));
    }

    @Test
    public void testSegundoCaracterePrimeiroLoop() {
        assertTrue(id.validateIdentifier("aZ"));
    }

    @Test
    public void testLoopComVariosCaracteres() {
        assertTrue(id.validateIdentifier("a1b2C"));
    }

    @Test
    public void testFalhaAposPrimeiroSerValido() {
        assertFalse(id.validateIdentifier("aB?"));
    }


    @Test
    public void testValid_sLetraMaiuscula() {
        assertTrue(id.valid_s('A'));
    }

    @Test
    public void testValid_sLetraMinuscula() {
        assertTrue(id.valid_s('z'));
    }

    @Test
    public void testValid_sInvalido() {
        assertFalse(id.valid_s('1'));
    }

    @Test
    public void testValid_fLetra() {
        assertTrue(id.valid_f('b'));
    }

    @Test
    public void testValid_fNumero() {
        assertTrue(id.valid_f('7'));
    }

    @Test
    public void testValid_fInvalido() {
        assertFalse(id.valid_f('&'));
    }
}
