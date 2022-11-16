package basic;

public class interface_example {
    public static void main(String[] args) {
        Stippen s = new Stippen();
        s.Student1();
        s.Student2();

    }
}

interface Attendence {
    void Student1();
//    public  void khushi(){
//
//    }
//    class std(){
//        inside interface we cant make class or declare any function
//    }

    void Student2();

}

class Stippen implements Attendence {

    @Override
    public void Student1() {

        System.out.println("he was on leave for 2 days");
    }

    @Override
    public void Student2() {

        System.out.println("he was present all day");
    }
}
