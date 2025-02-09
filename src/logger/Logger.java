package logger;

/*
 * Coding Steps — Object Oriented Programming
 * 1.Create an interface named Logger.
 * 
 * 2.Add two void methods to the Logger interface, each should take a String as an argument
 *   a.log
 *   b.error
 *   
 * 3.Create two classes that implement the Logger interface
 *   a.  AsteriskLogger
 *   b.  SpacedLogger
 *   
 * 4. Implement the AsteriskLogger methods:  
 *    ****************
 *    ***Error: Hello***
 *    ****************
 *    
 * 5.Implement the SpacedLogger methods:
 *    a.If the log method received “Hello” as an argument, it should print H e l l o
 *    b.The error method should do the same, but with “ERROR:” preceding the spaced out i
 *    nput (i.e. ERROR: H e l l o)
 *    
 * 6. Create a class named App that has a main method.
 *      a.If the log method received “Hello” as an argument, it should print H e l l o
 *      b.The error method should do the same, but with “ERROR:” preceding the spaced out 
 *      input (i.e. ERROR: H e l l o)
 * 
 */

public interface Logger {
	void log(String message);
    void error(String message);
}
