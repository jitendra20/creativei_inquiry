package creativei.vo;

/**
 * Created by Aayush on 12/16/2017.
 */
public class ResponseObject {
    public enum ResponseStatus {
        SUCCESS,
        ERROR
    }

    private Object data;
    private Error exception;
    private ResponseStatus status;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public ResponseObject(Object data){
        this.data = data;
    }
    public ResponseObject(Object data, ResponseStatus status){
        this.data = data;
        this.status = status;
    }

    public ResponseObject(Error exception){
        this.exception = exception;
    }
    public ResponseObject(String exceptionMessage, String errorCode){
        this.exception.setMessage(exceptionMessage);
        this.exception.setErrorCode(errorCode);
    }

    public ResponseObject(Object data, Error exception){
        this.data = data;
        this.exception = exception;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Error getException() {
        return exception;
    }

    public void setException(Error exception) {
        this.exception = exception;
    }
}
