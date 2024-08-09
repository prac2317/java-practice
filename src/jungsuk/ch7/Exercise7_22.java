package jungsuk.ch7;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    public Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Circle extends Shape{
    double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p) {
        super(p);
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

public class Exercise7_22 {

    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:" + sumArea(arr));
    }

}
