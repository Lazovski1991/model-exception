package exception;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class ExceptionModel {
    private HttpStatus httpStatus;
    private String message;
    private String code;
    private LocalDateTime time;
}
