package cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.*;


public class Hooks {
	
    public static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static PrintStream originalOut;
	
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }	
	
	@After
    public void afterScenario(){
        System.setOut(originalOut);
        outContent.reset();
        System.out.println("This will run after the Scenario");
    }
}