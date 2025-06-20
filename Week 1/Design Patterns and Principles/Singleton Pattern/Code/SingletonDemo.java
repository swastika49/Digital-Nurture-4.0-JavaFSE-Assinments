public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log.");

        if (logger1 == logger2) {
            System.out.println("Same logger instance used.");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
