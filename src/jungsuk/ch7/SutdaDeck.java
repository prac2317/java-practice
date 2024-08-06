package jungsuk.ch7;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            if (i < 10) {
                int num = i+1;
                boolean isKwang = false;
                if (num == 1 | num == 3 | num == 8) {
                    if (0.5 > Math.random()) isKwang = true;
                }
                SutdaCard sutdaCard = new SutdaCard(num, isKwang);
                cards[i] = sutdaCard;
            } else {
                int num = i+1 - 10;
                boolean isKwang = false;
                if (num == 1 | num == 3 | num == 8) {
                    isKwang = !cards[i-10].isKwang;
                }
                SutdaCard sutdaCard = new SutdaCard(num, isKwang);
                cards[i] = sutdaCard;
            }

        }
    }
    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int j = (int) (Math.random() * 20);

            SutdaCard temp = cards[j];
            cards[j] = cards[i];
            cards[i] = temp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int) (Math.random() * 20);
        return cards[index];
    }
}