package edu.wofford;


public class Main {

	public static void main(String[] args) {
	    if (args.length == 0) {
	        GuiMain.main(null);
	    } else {
	        ConsoleMain.main(args);
	    }
	}
}