public class Radio {
    private int numberStation;
    private int volume;

    public int getRadio() {

        return numberStation;
    }

    public void setRadio(int radio) {
        if (radio < 0) {
            return;
        }
        if (radio > 9) {
            return;
        }
        this.numberStation = radio;
    }

    public void nextRadio() {
        if (numberStation < 9) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    public void prevRadio() {
        if (numberStation > 0) {
            numberStation--;
        } else {
            numberStation = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            volume = 10;
        }
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume < 10) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

}