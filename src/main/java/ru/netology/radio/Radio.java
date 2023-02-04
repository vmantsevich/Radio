package ru.netology.radio;

public class Radio {




    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int numberOfCurrentRadioStation;
    private int numberOfCurrentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

   ;
    public Radio() {


    }

    public Radio(int quantityOfRadioStation) {
        numberOfCurrentRadioStation = quantityOfRadioStation - 1;

    }

    public int getNumberOfCurrentRadioStation() {

        return numberOfCurrentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int newNumberOfCurrentRadioStation) {
        if (newNumberOfCurrentRadioStation < minRadioStation) {
            newNumberOfCurrentRadioStation = maxRadioStation;
        }
        if (newNumberOfCurrentRadioStation > maxRadioStation) {
            newNumberOfCurrentRadioStation = minRadioStation;
        }
        numberOfCurrentRadioStation = newNumberOfCurrentRadioStation;
    }

    public int getNumberOfCurrentVolume() {

        return numberOfCurrentVolume;
    }

    public void setNumberOfCurrentVolume(int newNumberOfCurrentVolume) {
        if (newNumberOfCurrentVolume < minVolume) {
            newNumberOfCurrentVolume = minVolume;
        }
        if (newNumberOfCurrentVolume > maxVolume) {
            newNumberOfCurrentVolume = maxVolume;
        }
        numberOfCurrentVolume = newNumberOfCurrentVolume;
    }
    

    public void next() {
        int station = numberOfCurrentRadioStation + 1;
        setNumberOfCurrentRadioStation(station);
    }

    public void prev() {
        int station = numberOfCurrentRadioStation - 1;
        setNumberOfCurrentRadioStation(station);
    }

    public void volumePlus() {
        int volume = numberOfCurrentVolume + 1;
        setNumberOfCurrentVolume(volume);
    }

    public void volumeMinus() {
        int volume = numberOfCurrentVolume - 1;
        setNumberOfCurrentVolume(volume);
    }


}


