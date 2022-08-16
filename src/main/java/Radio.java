public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxiStation = 9;
    int miniStation = 0;
    int maxiVolume = 100;
    int miniVolume = 0;

    public Radio() {
    }

    public Radio(int maxiStation) {
        this.maxiStation = maxiStation;

    }

    public int getMaxiStation() {
        return maxiStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxiStation || newStation < miniStation) {
            return;
        }
        this.currentStation = newStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > maxiVolume || newVolume < miniVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void pressNextStation() {
        if (currentStation == maxiStation) {
            setCurrentStation(miniStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation == miniStation) {
            setCurrentStation(maxiStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }
}
