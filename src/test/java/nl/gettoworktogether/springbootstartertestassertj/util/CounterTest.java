package nl.gettoworktogether.springbootstartertestassertj.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void testCounterAdd() {

        // arange
        Counter counter = new Counter();

        counter.add(45);
        counter.add(67);
        counter.add(32);

        // act
        int actual = counter.getTotal();

        // assert
        int expected = 144;
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

}