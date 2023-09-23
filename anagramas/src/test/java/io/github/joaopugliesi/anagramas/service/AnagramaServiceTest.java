package io.github.joaopugliesi.anagramas.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramaServiceTest {

    private AnagramaService service;

    @BeforeEach
    public void setUp() {
        service = new AnagramaService();
    }

    @Test
    public void testAnagramas() {
        assertTrue(service.anagramas("tom marvolo riddle", "I am lord voldemort"));
        assertTrue(service.anagramas("cubo", "buco"));
        assertTrue(service.anagramas("alegria", "regalia"));

        assertFalse(service.anagramas("bem", "mau"));
        assertFalse(service.anagramas("abc", "def"));
        assertFalse(service.anagramas("cat", "dog"));
    }
}
