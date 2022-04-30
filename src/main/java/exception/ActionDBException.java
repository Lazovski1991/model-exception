package exception;

public class ActionDBException extends CoreException {

    public ActionDBException(Throwable e, String message, String code) {
        super(e, message, code);
    }
    public ActionDBException(String message, String code) {
        super(message, code);
    }

}
