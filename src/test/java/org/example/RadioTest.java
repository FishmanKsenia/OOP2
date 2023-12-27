package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStation(3);

        int expected = 3;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationIfBelow() {
        Radio radio = new Radio();

        radio.setStation(-3);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationIfAbove() {
        Radio radio = new Radio();

        radio.setStation(13);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNext() {
        Radio radio = new Radio();

        radio.setStation(4);
        radio.nextStation();

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextIfMax() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrev() {
        Radio radio = new Radio();

        radio.setStation(3);
        radio.prevStation();

        int expected = 2;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevIfMin() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(13);

        int expected = 13;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfBelow() {
        Radio radio = new Radio();

        radio.setVolume(15);
        radio.setVolume(-15);

        int expected = 15;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfAbove() {
        Radio radio = new Radio();

        radio.setVolume(10);
        radio.setVolume(115);

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(20);
        radio.increaseVolume();

        int expected = 21;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(30);
        radio.decreaseVolume();

        int expected = 29;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
