public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Greeter greeter = new Greeter();
        greeter.greet("Martin");
        AgePrinter agePrinter = new AgePrinter();
        agePrinter.count(25);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.greetingsToWorld();

        Cheerer cheerer = new Cheerer();
        cheerer.cheer();

        future();

    }

    public static void future() {

        System.out.println("something");
    }
}