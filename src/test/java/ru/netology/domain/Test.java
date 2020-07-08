package ru.netology.domain;

import static org.junit.Assert.*;

public class Test {

    @org.junit.jupiter.api.Test
    void IfNotMaxStation_NextStation() {
        Radio radio = new Radio(0, 0);
        radio.Next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfMaxStation_NextIsMinStation() {
        Radio radio = new Radio(9, 0);
        radio.Next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfNotMinValue_PrevStation() {
        Radio radio = new Radio(3, 0);
        radio.Prev();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfMinValue_PrevIsMaxStation() {
        Radio radio = new Radio(0, 0);
        radio.Prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfNotMaxVolume_IncrementVolume() {
        Radio radio = new Radio(0, 5);
        radio.VolumeUp();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfMaxVolume_DoNothing() {
        Radio radio = new Radio(9, 10);
        radio.VolumeUp();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfNotMinVolume_DecrementVolume() {
        Radio radio = new Radio(0, 5);
        radio.VolumeDown();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfMinVolume_DoNothing() {
        Radio radio = new Radio(3, 0);
        radio.VolumeDown();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void IfLessMinStation_DoNothing() {
        Radio radio = new Radio(0, 0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void IfMoreMaxStation_DoNothing() {
        Radio radio = new Radio(9, 0);
        radio.setCurrentRadioStation(12);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void IfMoreMinAndLessMaxStation_SetStation() {
        Radio radio = new Radio(5, 0);
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}
