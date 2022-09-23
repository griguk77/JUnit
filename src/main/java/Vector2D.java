public class Vector2D {
    private final double x = 4;
    private final double y = 3;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double minus(int i) {
        if (i <= 5)
            throw new ArithmeticException("Can't minus with i < 5");
        return i - x;
    }
}
