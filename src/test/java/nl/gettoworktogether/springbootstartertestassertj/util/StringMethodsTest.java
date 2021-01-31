package nl.gettoworktogether.springbootstartertestassertj.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringMethodsTest {

    @Test
    void simpelTest() {
        String s = "abcdefg";
        String actual = s.toUpperCase();
        String expected = "ABCDEFG";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void simpelTest2() {
        String s = "ABCDEFG";
        String actual = s.toLowerCase();
        String expected = "abcdefg";
        assertThat(actual).isEqualTo(expected);
    }

}
