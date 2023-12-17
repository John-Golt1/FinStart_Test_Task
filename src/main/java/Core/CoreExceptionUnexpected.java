package Core;

public class CoreExceptionUnexpected extends RuntimeException {

    public CoreExceptionUnexpected() {
        super();
    }

    public CoreExceptionUnexpected(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreExceptionUnexpected(String message) {
        super(message);
    }

    public CoreExceptionUnexpected(Throwable cause) {
        super(cause);
    }

}
