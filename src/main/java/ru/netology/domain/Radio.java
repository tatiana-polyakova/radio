package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int radioStationCount = 10;
    private int maxRadiostation = 9;
    private int minRadiostation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    boolean on;

    public Radio(int currentRadioStation, int currentSoundVolume) {
        if (currentRadioStation >= minRadiostation && currentRadioStation <= maxRadiostation) {
            this.currentRadioStation = currentRadioStation;
        }
        if (currentSoundVolume >= minSoundVolume && currentSoundVolume <= maxSoundVolume) {
            this.currentSoundVolume = currentSoundVolume;
        }
    }

    public Radio(int radioStationCount) {
        this.radioStationCount = radioStationCount;
        maxRadiostation = radioStationCount - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (maxRadiostation < currentRadioStation || currentRadioStation < minRadiostation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == maxRadiostation) {
            currentRadioStation = minRadiostation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == minRadiostation) {
            currentRadioStation = maxRadiostation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void volumeUp() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }

        currentSoundVolume = currentSoundVolume + 1;
    }

    public void volumeDown() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }

        currentSoundVolume = currentSoundVolume - 1;
    }
}