package ru.netology.radio;

public class Radio {

    public int numberOfCurrentRadioStation;

    public int getNumberOfCurrentRadioStation() {
        return numberOfCurrentRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int newNumberOfCurrentRadioStation) {
        if (newNumberOfCurrentRadioStation < 0) {
            newNumberOfCurrentRadioStation = 9;
        }
        if (newNumberOfCurrentRadioStation > 9) {
            newNumberOfCurrentRadioStation = 0;
        }
        numberOfCurrentRadioStation = newNumberOfCurrentRadioStation;
    }

    public void next() {
        int station = numberOfCurrentRadioStation + 1;
        setNumberOfCurrentRadioStation(station);
    }

    public void prev() {
        int station = numberOfCurrentRadioStation - 1;
        setNumberOfCurrentRadioStation(station);
    }

    public int numberOfCurrentVolume;

    public int getNumberOfCurrentVolume() {
        return numberOfCurrentVolume;
    }
    public void setNumberOfCurrentVolume(int newNumberOfCurrentVolume) {
        if (newNumberOfCurrentVolume < 0) {
            newNumberOfCurrentVolume = 0;
        }
        if (newNumberOfCurrentVolume > 10) {
           newNumberOfCurrentVolume = 10;
        }
        numberOfCurrentVolume = newNumberOfCurrentVolume;

    }

    public void volumePlus() {
        int volume = numberOfCurrentVolume + 1;
        setNumberOfCurrentVolume(volume);
    }

    public  void volumeMinus() {
        int volume = numberOfCurrentVolume - 1;
        setNumberOfCurrentVolume(volume);
    }


}


