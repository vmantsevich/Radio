package ru.netology.radio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio(10);
        station.setNumberOfCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio station = new Radio(10);
        station.setNumberOfCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNext() {
        Radio station = new Radio(10);
        station.setNumberOfCurrentRadioStation(9);
        station.next();

        int expected = 0;
        int actual = station.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrev() {
        Radio station = new Radio(10);
        station.setNumberOfCurrentRadioStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();
        volume.setNumberOfCurrentVolume(101);

        int expected = 100;
        int actual = volume.getNumberOfCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();
        volume.setNumberOfCurrentVolume(0);

        int expected = 0;
        int actual = volume.getNumberOfCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumePlus() {
        Radio volume = new Radio();
        volume.setNumberOfCurrentVolume(100);
        volume.volumePlus();

        int expected = 100;
        int actual = volume.getNumberOfCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinus() {
        Radio volume = new Radio();
        volume.setNumberOfCurrentVolume(0);
        volume.volumeMinus();

        int expected = 0;
        int actual = volume.getNumberOfCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
