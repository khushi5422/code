package basic;

public class poly_example {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        square.Area(32, 4);
        rectangle.Area(3, 4);
        triangle.Area(21, 32);
    }
}

class Shapes {
    public void Area(int length, int breadth) {
        System.out.println("area of different shapes depends on length and breadth");
    }
}

class Square extends Shapes {
    public void Area(int length, int breadth) {
        int total = length * length;
        System.out.println("area of  square is:" + total);
    }
}

class Rectangle extends Shapes {
    public void Area(int length, int breadth) {
        int total = length * breadth;
        System.out.println("area of  square is:" + total);
    }
}

class Triangle extends Shapes {
    public void Area(int base, int height) {
        int total = (height * base) / 2;
        System.out.println("area of  basic.Triangle is:" + total);
    }
}
