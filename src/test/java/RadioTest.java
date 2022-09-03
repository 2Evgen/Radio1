import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setMaxiStationTest() {
        int expected = 9;
        Radio radio = new Radio(expected);

        assertEquals(expected, radio.getMaxiStation());
    }

    @Test
    public void shouldCorrectMaxStationForNumber() {
        Radio station = new Radio();

        assertEquals(9, station.getNumberStations());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        volume.setCurrentVolume(101);

        int expected = 11;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCorrectMaxStation() {
        Radio station = new Radio(10);

        Assertions.assertEquals(9, station.getMaxiStation());
    }

    @Test
    void shouldSetVolumeNegative() {
        Radio radio = new Radio(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void StationOverMax() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(11);
        radio.setCurrentStation(10);
        radio.pressNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverMin() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(0);
        radio.pressPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCorrectMinStation() {
        Radio radio = new Radio(0);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

}


