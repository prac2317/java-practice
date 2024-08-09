package jungsuk.ch7;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (p.price > money) {
            System.out.println("잔액이 부족하여 " + p.toString() + "을/를 살 수 없습니다." );
            return;
        }
        money = money - p.price;
        add(p);
    }

    void add(Product p) {
        if (cart[cart.length - 1] != null) {
            Product[] newCart = new Product[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                newCart[j] = cart[j];
            }
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        System.out.print("구입한 물건:");
        for (Product product : cart) {
            System.out.print(product.toString() + ",");
        }
        System.out.println();

        int usedMoney = 0;
        for (Product product : cart) {
            usedMoney += product.price;
        }
        System.out.println("사용한 금액: " + usedMoney);
        System.out.println("남은 금액: " + money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
