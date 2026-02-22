package LoggingPackage;

import java.time.LocalDateTime;

public record LogStatement(String logLine, LogLevel logLevel, LocalDateTime timeStamp) {
}
