package LoggingPackage;

public class InMemoryLogFormatter implements LogFormatter{
    @Override
    public String format( LogStatement l) {
        return l.timeStamp() + " - ["+l.logLevel()+"] - "+l.logLine();
    }

}
