public class main  {
    public static void main(String[] args) {
        try {
            Triangle a = new Triangle(3,1,5);
        } catch (IllegalRightTriangleException e) {
            System.out.println(e.errorMessage);
        }
    }
}
