package jungsuk.ch6;

public class Exercise6_6 {

    static double getDistance(int x, int y, int xl, int yl) {

        return Math.sqrt((x-xl) * (x-xl) + (y-yl) * (y-yl));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
