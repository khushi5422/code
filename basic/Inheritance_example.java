package basic;

public class Inheritance_example {
    public void printparent() {
        System.out.println("This is parent class");
    }

}

class child1 extends Inheritance_example {
    public void printchild1() {
        System.out.println("This is  first child class ");
    }

    public static void main(String[] args) {
        Inheritance_example inheritance_example = new Inheritance_example();
        child1 child = new child1();
        inheritance_example.printparent();
        child.printchild1();
        child.printparent();
    }
}
