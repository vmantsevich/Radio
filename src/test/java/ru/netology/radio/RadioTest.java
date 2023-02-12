package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMinBorderStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxBorderStation() {
        Radio station = new Radio();
        station.setCurrentStation(100);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestBorderMinVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(-2);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestBorderMaxVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(150);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrev() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldTestBorderPrev() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.prev();
        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNext() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetNext() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.next();

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.nextVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetNextVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(50);
        station.nextVolume();

        int expected = 51;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.prevVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestSetPrevVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(8);
        station.prevVolume();

        int expected = 7;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio station = new Radio();
        station.setMaxStation(9);
        int expected = 9;
        int actual = station.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio station = new Radio();
        station.setMinStation(0);
        int expected = 0;
        int actual = station.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMaxVolume() {
        Radio station = new Radio();
        station.setMaxVolume(100);
        int expected = 100;
        int actual = station.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio station = new Radio();
        station.setMinVolume(0);
        int expected = 0;
        int actual = station.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationConstructor() {
        Radio station = new Radio(10);
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}