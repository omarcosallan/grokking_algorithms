package main;

public class Greet {

    public static void main(String[] args) {
        greet("maggie");
    }

    /*
        call stack:
            1. greet("maggie") => name = maggie
     */
    private static void greet(String name) {
        System.out.println("hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    /*
        call stack:
            2. greet2("maggie") => name = maggie
            1. greet("maggie") => name = maggie
     */
    private static void greet2(String name) {
        System.out.println("how are you, " + name + "?");
    }

    /*
        call stack:
            2. bye()
            1. greet("maggie") => name = maggie
     */
    private static void bye() {
        System.out.println("ok bye!");
    }
}
