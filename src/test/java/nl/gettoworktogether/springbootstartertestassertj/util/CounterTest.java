package nl.gettoworktogether.springbootstartertestassertj.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

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

    @Test
    void addWithLoopTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.addWithLoop(getallen);
        int expected = 6;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addWithStreamTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.addWithStream(getallen);
        int expected = 6;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getSmallestNumberTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.getSmallestNumber(getallen);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    void getSmallestNumberWithEmptyArrayTest() {
        int[] numbers = new int[] {};
        int actual = Counter.getSmallestNumber(numbers);
    }

    @Test
    void testTellerInstantiate() {
        Counter counter = new Counter();
        assertThat(counter).isNotNull();
        assertThat(counter.getTotal()).isEqualTo(0);
    }

    @Test
    void testTellerAdd() {
        // given
        Counter counter = new Counter();

        counter.add(45);
        counter.add(67);
        counter.add(32);

        // when
        int actual = counter.getTotal();

        // then
        int expected = 144;
        assertThat(actual).isEqualTo(expected);
    }

}