package LoggingPackage;

public enum LogLevel {
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4);

    LogLevel(int p) {
        priority = p;
    }

    public int getPriority() {
        return priority;
    }

    private final int priority; // higher is better
}
