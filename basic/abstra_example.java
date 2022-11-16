package basic;

public class abstra_example {


    public static void main(String[] args) {

        Red red = new Red();
        Blue blue = new Blue();
        blue.primary();
        blue.Secondary();

        red.primary();
        red.Secondary();

    }
}
abstract class Colors {
    abstract void primary();

    abstract void Secondary();

    public void Mixed() {
        String s = "hello";
    }
}
  class Red extends  Colors{

    @Override
    void primary() {
        System.out.println("red is primary color");

    }

    @Override
    void Secondary() {

        System.out.println("maroon is secondary shade of red");
    }
}
class  Blue extends Colors{

    @Override
    void primary() {

        System.out.println("blue is basic");
    }

    @Override
    void Secondary() {

        System.out.println("royal blue is secondary color");
    }
}

