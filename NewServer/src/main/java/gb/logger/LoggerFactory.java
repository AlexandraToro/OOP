package gb.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
