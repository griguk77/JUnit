public class MyMath {
    public double divide(int numberFirst, int numberSecond) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (numberSecond == 0)
            throw new RuntimeException("Can't divide by 0");

        return numberFirst / numberSecond;
    }
}
