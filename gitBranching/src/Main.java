public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Greeter greeter = new Greeter();
        greeter.greet();
        AgePrinter agePrinter = new AgePrinter();
        agePrinter.count(25);
    }
}