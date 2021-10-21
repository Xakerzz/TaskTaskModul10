package Task10;

public class WeAllLikeDoException extends Exception {
    private String message;
    private int codError;

    public WeAllLikeDoException(String message, int codError) {
        this.message = message;
        this.codError = codError;
    }

    @Override
    public String toString() {
        return "ArrayNegativeException{" +
                "message='" + message + '\'' +
                ", codError=" + codError +
                '}';
    }
}

