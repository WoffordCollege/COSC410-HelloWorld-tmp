package keywords;


import java.io.*;
import java.util.NoSuchElementException;
import edu.wofford.*;


public class Console {
    private String inputString;
    private String outputString;
    private String userString;

    public void theUserStartsTheProgram(String string) {
        inputString = "";
        outputString = "";
        userString = string;
    }
    
    public void theUserViewsTheInterface() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        try {
            System.setIn(new ByteArrayInputStream(inputString.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            try {
                String[] args = {userString};
                ConsoleMain.main(args);
            } catch (NoSuchElementException e) { }
            outputString = outContent.toString();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
    
    public String getProgramResponse() {
        return outputString.trim();
    }
}