package exception;

public class ExternalApiException extends CoreException {

    public ExternalApiException(Throwable e, String message, String code) {
        super(e, message, code);
    }
    public ExternalApiException(String message, String code) {
        super(message, code);
    }

}
