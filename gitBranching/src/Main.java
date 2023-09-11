public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Greeter greeter = new Greeter();
        greeter.greet("Pavel & Petr");
        AgePrinter agePrinter = new AgePrinter();
        agePrinter.count(25);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.greetingsToWorld("Pavel", "Caska");

        Cheerer cheerer = new Cheerer();
        cheerer.cheer("Slova!");

        System.out.println(future());

    }

    public static String future() {

     return "fire rabit";
    }
}