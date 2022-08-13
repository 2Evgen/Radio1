import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    @Test
    void test1RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void test2RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(9);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(-5);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void test4RadioNext() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void test1RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(5);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void test2RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(11);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test3RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test4RadioPrev() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void Test1VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void Test2VolumeUp() {
        Radio radio = new Radio();

        radio.setVolume(12);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void Test1VolumeDown() {
        Radio radio = new Radio();

        radio.setVolume(3);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 2;

        assertEquals(actual, expected);
    }

    @Test
    void Test2VolumeDown() {
        Radio radio = new Radio();

        radio.setVolume(-5);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

}