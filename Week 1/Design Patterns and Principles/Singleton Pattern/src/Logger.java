public class Logger {
    private static Logger instance; // Step 2a

    // Step 2b
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 2c
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create instance only once
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
