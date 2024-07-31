package jungsuk.ch6;

public class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public SutdaCard() {
        this(1, true);
    }

    public String info() {
        return num +  (isKwang ? "K" : "");
    }
}
