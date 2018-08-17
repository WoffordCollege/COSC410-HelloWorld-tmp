package edu.wofford;

/**
 * The HelloWorld class is a simple class that produces a greeting.
 * 
 * @author Aaron Garrett
 * @since 1.0
 */ 

public class HelloWorld {
    
    /**
     * Return "hello world".
     * 
     * @return  "hello world"
     * @since   1.0
     */
    public String showIt() {
        return "hello world";
    }
    
    /**
     * Return "dlrow olleh".
     * 
     * @return  "dlrow olleh"
     * @since   1.0
     */
    public String reverseIt() {
        return "dlrow olleh";
    }
    
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












