package LoggingPackage;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Logger {

    private final LinkedList<LogAppender> appenders = new LinkedList<>();
    private LogLevel baseLogLevel; // if log is < base, dont append

    public Logger(LogLevel base) {
        baseLogLevel = base;
    }

    public LogLevel getBaseLogLevel() {
        return baseLogLevel;
    }

    public void setBaseLogLevel(LogLevel baseLogLevel) {
        this.baseLogLevel = baseLogLevel;
    }

    public void addAppender(LogAppender l) {
        appenders.add(l);
    }

    public void log(LogLevel level, String message) {
        if (level.getPriority() < baseLogLevel.getPriority()) return;
        LogStatement statement = new LogStatement(message, level, LocalDateTime.now());
        for (LogAppender appender : appenders) {
            try {
                appender.appendLog(statement);
            } catch (Exception e) {
            }
        }
    }

//    DEBUG(1),
//    INFO(2),
//    WARN(3),
//    ERROR(4);

    public void debug(String logLine) {
        log(LogLevel.DEBUG, logLine);
    }

    public void info(String logLine) {
        log(LogLevel.INFO, logLine);
    }

    public void warn(String logLine) {
        log(LogLevel.WARN, logLine);
    }

    public void error(String logLine) {
        log(LogLevel.ERROR, logLine);
    }

}
