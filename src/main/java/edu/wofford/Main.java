package edu.wofford;


public class Main {
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        if (args.length > 0) {
            if (args[0].equals("forward")) {
                System.out.println(h.showIt());
            } else if (args[0].equals("backward")) {
                System.out.println(h.reverseIt());
            }
        }
    }
}