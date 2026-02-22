package LoggingPackage;

import java.util.HashMap;

public class LoggingManager {

    private final HashMap<String, Logger> LoggerMap = new HashMap<>();
    public Logger getLoggerInstance(String key) {
        return LoggerMap.get(key);
    }

    public Logger getOrCreateLoggerInstance(String key, LogLevel baseLogLevel) {

        Logger l = LoggerMap.get(key);
        if (l == null) {
            l = new Logger(baseLogLevel);
            LoggerMap.put(key, l);
        }

        return l;
    }
}
