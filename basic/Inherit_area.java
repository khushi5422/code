package basic;

class Rectangleinherit {
    int length, breadth;

    Rectangleinherit(int l, int b) {
        length = l;
        breadth = b;

    }

    void area() {
        System.out.println(length * breadth);
    }

    void Perimeter() {

        System.out.println(2 * (length + breadth));

    }
}

class Squareinherit extends Rectangleinherit {
    int side;

    public Squareinherit(int s) {
        super(s, s);

    }
}

public class Inherit_area {
    public static void main(String[] args) {
        Rectangleinherit rectangle = new Rectangleinherit(20, 31);
        Squareinherit square = new Squareinherit(3);
        rectangle.area();
        rectangle.Perimeter();
        square.area();
        square.Perimeter();


    }
}
