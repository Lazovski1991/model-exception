package exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CoreException extends RuntimeException {
    private String code;

    public CoreException(String message) {
        super(message);
    }

    public CoreException(Throwable e, String message) {
        super(message, e);
    }

    public CoreException(Throwable e, String message, String code) {
        super(message, e);
        this.code = code;
    }

    public CoreException(String message, String code) {
        super(message);
        this.code = code;
    }
}
