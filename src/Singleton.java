class Logger {
    // Static instance of the logger (singleton)
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Optional: Initialize resources like files if needed
    }

    // Method to return the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create the instance only once
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
        // Optional: You could write this to a file instead of the console
    }
}

// Test class
public class Singleton {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("This is the first log message");
        logger2.log("This is the second log message");

        // Check if both loggers are the same instance
        System.out.println(logger1 == logger2); // Output: true (same instance)
    }
}
