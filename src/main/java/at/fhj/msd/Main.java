package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.minus(2,1));
        System.out.println(c.divide(3,2));
        System.out.println(c.multiply(2,1));
    }
}
