package LoggingPackage;
import java.util.LinkedList;

public class InMemoryAppender implements LogAppender{

    private final LinkedList<String> logText = new LinkedList<>();
    private final LogFormatter logFormatter;

    public InMemoryAppender() {
        this(new InMemoryLogFormatter());
    }

    public InMemoryAppender(LogFormatter l) {
        logFormatter = l;
    }

    @Override
    public void appendLog(LogStatement logStatement) {
        String logLine = logFormatter.format(logStatement);
        logText.add(logLine);
    }

    public void printLog() {
        for(String logLine: logText) {
            System.out.println(logLine);
        }
    }
}
