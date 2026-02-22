//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import LoggingPackage.*;
public class Main {
    public static void main(String[] args) {

        LoggingManager loggingManager = new LoggingManager();
        Logger l = loggingManager.getOrCreateLoggerInstance(Main.class.getName(), LogLevel.INFO);
        InMemoryAppender f = new InMemoryAppender();
        l.addAppender(f);

        l.debug("debug statement");
        l.info("info statement");
        l.warn("warn statement");
        l.error("error statement");

        f.printLog();
    }
}