package MakeException;

public class InsufficientException extends Exception{
    public InsufficientException() {
        //기본 생성자
    }
    public InsufficientException(String message) {
        super(message);
        //예외 메세지를 입력받는 생성자
    }
}
