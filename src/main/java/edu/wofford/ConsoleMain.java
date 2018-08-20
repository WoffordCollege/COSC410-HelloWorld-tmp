package edu.wofford;


public class ConsoleMain {
    public static void main(String[] args) {
        if (args.length > 0) {
            HelloWorld h = new HelloWorld();
            if (args[0].equals("forward")) {
                System.out.println(h.showIt());
            } else if (args[0].equals("backward")) {
                System.out.println(h.reverseIt());
            }
        }
    }
}