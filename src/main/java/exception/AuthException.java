package exception;

public class AuthException extends CoreException {
    public AuthException(Exception e, String message, String code) {
        super(e, message, code);
    }
    public AuthException(String message, String code) {
        super(message, code);
    }
}
