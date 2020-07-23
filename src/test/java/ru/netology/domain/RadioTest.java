package ru.netology.domain;

import static org.junit.Assert.*;

public class RadioTest {

    @org.junit.jupiter.api.Test
    void ifNotMaxStationNextStation() {
        Radio radio = new Radio(0, 0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifNewMaxStationNextIsMinStation() {
        Radio radio = new Radio(15);
        radio.setRadioStationNumber(14);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMaxStationNextIsMinStation() {
        Radio radio = new Radio(9, 0);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifNotMinValuePrevStation() {
        Radio radio = new Radio(3, 0);
        radio.prev();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMinValuePrevIsMaxStation() {
        Radio radio = new Radio(0, 0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifNotMaxVolumeIncrementVolume() {
        Radio radio = new Radio(0, 5);
        radio.volumeUp();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMaxVolumeDoNothing() {
        Radio radio = new Radio(9, 100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifNotMinVolumeDecrementVolume() {
        Radio radio = new Radio(0, 5);
        radio.volumeDown();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMinVolumeDoNothing() {
        Radio radio = new Radio(3, 0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifLessMinStationDoNothing() {
        Radio radio = new Radio(0, 0);
        radio.setRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMoreMaxStationDoNothing() {
        Radio radio = new Radio(9, 0);
        radio.setRadioStationNumber(12);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifMoreMinAndLessMaxStationSetStation() {
        Radio radio = new Radio(5, 0);
        radio.setRadioStationNumber(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifCurrentRadiostationEqualOrGreaterMinRadioStationIsCurrentRadioStation() {
        Radio radio = new Radio(12, 0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifCurrentRadiostationLessOrEqualMaxRadioStationIsCurrentRadioStation() {
        Radio radio = new Radio(-1, 0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ifCurrentSoundVolumeEqualOrGreaterMaxSoundVolumeIsDefaultSoundVolume() {
        Radio radio = new Radio(0, 120);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void ifCurrentSoundVolumeLessOrEqualMinSoundVolumeIsDefaultSoundVolume() {
        Radio radio = new Radio(0, -1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}