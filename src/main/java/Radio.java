public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxiStation = 9;
    private final int miniStation = 0;

    private int maxiVolume = 100;
    private int miniVolume = 0;
    private int numberOfStations = 9;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;

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
        int maxiVolume = 100;
        int miniVolume = 0;
        if (newVolume > maxiVolume || newVolume < miniVolume) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void pressNextStation() {
        if (currentStation == maxiStation) {

        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation == miniStation) {
            setCurrentStation(maxiStation);
        }
    }

    public int getNumberStations() {
        return numberOfStations;
    }
}
