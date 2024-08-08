package jungsuk.ch7;

public class MyTv2 {    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL){
            return;
        }
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME){
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void gotoPrevChannel() {
        int temp;
        temp = this.channel;
        this.channel = this.prevChannel;
        this.prevChannel = temp;
    }
}
