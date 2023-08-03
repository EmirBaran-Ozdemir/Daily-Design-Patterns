public class Main {
    public static void main(String[] args) {
        AbstractLogger loggerChain = ChainPattern.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
