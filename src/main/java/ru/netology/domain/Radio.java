package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int maxRadiostation = 9;
    private int minRadiostation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;
    boolean on;

    @Generated
    public Radio(int currentRadioStation, int currentSoundVolume) {
        if (currentRadioStation >= minRadiostation && currentRadioStation <= maxRadiostation)
            this.currentRadioStation = currentRadioStation;
        if (currentSoundVolume >= minSoundVolume && currentSoundVolume <= maxSoundVolume)
            this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (maxRadiostation < currentRadioStation || currentRadioStation < minRadiostation)
            return;

        this.currentRadioStation = currentRadioStation;
    }

    public void Next() {
        if (currentRadioStation == maxRadiostation)
            currentRadioStation = minRadiostation;
        else
            currentRadioStation = currentRadioStation + 1;
    }

    public void Prev() {
        if (currentRadioStation == minRadiostation)
            currentRadioStation = maxRadiostation;
        else
            currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void VolumeUp() {
        if (currentSoundVolume == maxSoundVolume)
            return;

        currentSoundVolume = currentSoundVolume + 1;
    }

    public void VolumeDown() {
        if (currentSoundVolume == minSoundVolume)
            return;

        currentSoundVolume = currentSoundVolume - 1;
    }
}