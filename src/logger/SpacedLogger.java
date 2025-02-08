package logger;

public class SpacedLogger implements Logger {

	 @Override
	    public void log(String message) {
	        System.out.println(String.join(" ", message.split("")));
	    }

	    @Override
	    public void error(String message) {
	        String spacedMessage = String.join(" ", message.split(""));
	        System.out.println("ERROR: " + spacedMessage);
	    }
	
}
