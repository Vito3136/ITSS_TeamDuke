package homework1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsiemeDiStringheTest {

    @Nested
    @DisplayName("Classe di test per il metodo stringaLunga")
    class StringaLungaTest {

        @Test
        @DisplayName("T1 - T2")
        void stringsArrayNullOrEmpty() {
            //T1
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.stringaLunga(null));

            //T2
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.stringaLunga(new String[]{}));
        }

        @Test
        @DisplayName("T3")
        void stringsArrayWithOneStringNull() {
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.stringaLunga(new String[]{null}));
        }

        @Test
        @DisplayName("T4")
        void stringsArrayWithOneStringEmpty() {
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{""}), "");
        }

        @Test
        @DisplayName("T5 - T6")
        void stringsArrayWithOneString() {
            //T5
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"a"}), "a");

            //T6
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"abc"}), "abc");
        }

        @Test
        @DisplayName("T7")
        void stringsArrayWithOneStringAndOneStringNull() {
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.stringaLunga(new String[]{null, "abc"}));
        }

        @Test
        @DisplayName("T8")
        void stringsArrayWithOneStringAndOneStringEmpty() {
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"", "abc"}), "abc");
        }

        @Test
        @DisplayName("T9 - T10")
        void stringsArrayWithMoreThanOneString() {
            //T9
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"abc", "abcde"}), "abcde");

            //T10
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"abc", "abc"}), "abc");
        }

        @Test
        @DisplayName("T11 - T12")
        void stringsArrayWithMoreThanOneStringWithSpaces() {
            //T11
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"abcd", "ab ab"}), "ab ab");

            //T12
            assertEquals(InsiemeDiStringhe.stringaLunga(new String[]{"abc", "abc "}), "abc ");
        }
    }

    @Nested
    @DisplayName("Classe di test per il metodo spaziStringa")
    class SpaziStringaTest {

        @Test
        @DisplayName("T13 - T14")
        void stringsArrayNullOrEmpty() {
            //T13
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.spaziStringa(null));

            //T14
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{}),
                    "nessuna stringa con spazi");
        }

        @Test
        @DisplayName("T15")
        void stringsArrayWithOneStringNull() {
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.spaziStringa(new String[]{null}));
        }

        @Test
        @DisplayName("T16")
        void stringsArrayWithOneStringEmpty() {
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{""}),
                    "nessuna stringa con spazi");
        }

        @Test
        @DisplayName("T17 - T18 - T19")
        void stringsArrayWithOneString() {
            //T17
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"abc"}),
                    "nessuna stringa con spazi");

            //T18
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{" "}), " ");

            //T19
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"abc def ghi"}),
                    "abc def ghi");
        }

        @Test
        @DisplayName("T20")
        void stringsArrayWithOneStringNullAndOneStringWithSpaces() {
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.spaziStringa(new String[]{null, "abc def"}));
        }

        @Test
        @DisplayName("T21")
        void stringsArrayWithOneStringAndOneStringEmpty() {
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"", "abc def ghi"}),
                    "abc def ghi");
        }

        @Test
        @DisplayName("T22 - T23")
        void stringsArrayWithMoreThanOneString() {
            //T22
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"abc def", "abcde fghi jklmn"}),
                    "abcde fghi jklmn");

            //T23
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"ab cd ef", "abcde fghi jklmn"}),
                    "ab cd ef");
        }

        @Test
        @DisplayName("T24")
        void stringsArrayWithOneStringEmptyAndOneWithOnlySpace() {
            assertEquals(InsiemeDiStringhe.spaziStringa(new String[]{"", " "}), " ");
        }
    }

    @Nested
    @DisplayName("Classe di test per il metodo preStringa")
    class PreStringaTest {

        @Test
        @DisplayName("T25 - T26")
        void stringsArrayNullOrEmpty() {
            //T25
            assertThrows(IllegalArgumentException.class,
                    () -> InsiemeDiStringhe.preStringa("abc", null));

            //T26
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{}),
                    new String[]{});
        }

        @Test
        @DisplayName("T27 - T28")
        void preNullOrEmpty() {
            //T27
            assertThrows(IllegalArgumentException.class, () -> InsiemeDiStringhe.preStringa(null,
                    new String[]{"abc", "def", "ghi"}));

            //T28
            assertArrayEquals(InsiemeDiStringhe.preStringa("", new String[]{"abc", "def", "ghi"}),
                    new String[]{});
        }

        @Test
        @DisplayName("T29")
        void preEmptyAndStringsArrayWithOneStringEmpty() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("", new String[]{""}),
                    new String[]{});
        }

        @Test
        @DisplayName("T30")
        void preWithAStringAndStringsArrayWithStringWithoutThatPrefix() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{"def"}),
                    new String[]{});
        }

        @Test
        @DisplayName("T31")
        void preWithAStringAndStringsArrayWithStringWithThatPrefix() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{"abcde"}),
                    new String[]{"abcde"});
        }

        @Test
        @DisplayName("T32")
        void preWithAStringAndStringsArrayWithStrings() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{"abcde", "defgh", "abcghi"}),
                    new String[]{"abcde", "abcghi"});
        }

        @Test
        @DisplayName("T33")
        void preWithAStringAndStringsArrayWithThatPrefixWithASpace() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{"ab cde"}),
                    new String[]{});
        }

        @Test
        @DisplayName("T34")
        void preWithAStringAndStringsArrayWithTwoStringsEqualsWithThatPrefix() {
            assertArrayEquals(InsiemeDiStringhe.preStringa("abc", new String[]{"abcde", "abcde"}),
                    new String[]{"abcde", "abcde"});
        }

        @Test
        @DisplayName("T35")
        void stringsArrayWithStringNull() {
            assertThrows(IllegalArgumentException.class, () -> InsiemeDiStringhe.preStringa("abc",
                    new String[]{null}));
        }
    }
}
