package homework2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrovaNumeroTest {

    @Nested
    @DisplayName("Classe di test per il metodo trovaNumeroFrequente")
    class TrovaNumeroFrequenteTest {

        @Test
        @DisplayName("T1")
        void arrayEmpty() {
            TrovaNumero trovaNumero = new TrovaNumero();
            assertEquals(trovaNumero.trovaNumeroFrequente(new int[]{}), 0);
        }

        @Test
        @DisplayName("T2")
        void arrayNotEmpty() {
            TrovaNumero trovaNumero = new TrovaNumero();
            assertEquals(trovaNumero.trovaNumeroFrequente(new int[]{1, 2, 3, 4, 3, 5}), 3);
        }

    }
}
