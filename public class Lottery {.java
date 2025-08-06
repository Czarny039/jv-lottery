public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private static final int MAX_NUMBER = 100;
    return a new Ball object.
}

 public Ball getRandomBall() {
    Color randomColor = colorSupplier.getRandomColor();
    int randomNumber = random.nextInt(MAX_NUMBER) + 1;
    return new Ball(randomColor, randomNumber);
    }