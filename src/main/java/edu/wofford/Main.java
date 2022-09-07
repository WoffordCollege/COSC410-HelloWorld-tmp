package edu.wofford;


public class Main {

	public static void main(String[] args) {
		System.out.println("Juan is Juan");
	    if (args.length == 0) {
	        GuiMain.main(null);
	    } else {
	        ConsoleMain.main(args);
	    }
	}
}