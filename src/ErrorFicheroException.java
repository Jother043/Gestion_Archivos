public class ErrorFicheroException extends Exception{
    public ErrorFicheroException() {
    }

    public ErrorFicheroException(String message) {
        super(message);
    }

    public ErrorFicheroException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorFicheroException(Throwable cause) {
        super(cause);
    }

    public ErrorFicheroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
