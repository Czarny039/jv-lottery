public class ColorSupplier {
    private Random random = new Random();
    return a random Color.
    }
    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
