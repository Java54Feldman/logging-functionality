import java.util.logging.*;

public class LoggerAppl {
	static Logger logger = Logger.getLogger("LoggerAppl");
	
	public static void main(String[] args) throws Exception {
		LogManager.getLogManager().reset(); 
		
		logger.setLevel(Level.FINE); 
		Handler handler = new ConsoleHandler();
		Handler handlerFile = new FileHandler("logs");
		handler.setLevel(Level.FINEST);
		handlerFile.setLevel(Level.FINEST);
		handlerFile.setFormatter(new SimpleFormatter());
		
		logger.addHandler(handler);
		logger.addHandler(handlerFile);
		
		logger.severe("severe log");
		logger.warning("warning log");
		logger.info("info log");
		logger.config("config log");
		logger.fine("fine log");
		logger.finer("finer log");
		logger.finest("finest log");

	}

}
