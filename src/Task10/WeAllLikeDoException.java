package Task10;

public class WeAllLikeDoException extends Exception {
    private String message;
    private int Error;

    public WeAllLikeDoException(String message, int codError) {
        this.message = message;
        this.Error = codError;
    }

    @Override
    public String toString() {
        return "ArrayNegativeException{" +
                "message='" + message + '\'' +
                ", codError=" + Error +
                '}';
    }
}

