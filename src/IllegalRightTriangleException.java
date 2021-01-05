public class IllegalRightTriangleException extends Exception {
    String errorMessage;

    public IllegalRightTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getString() {
        return errorMessage;
    }
}
