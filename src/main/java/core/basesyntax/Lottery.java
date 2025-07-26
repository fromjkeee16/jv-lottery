package core.basesyntax;

import java.util.Random;

public class Lottery {
    final static int maxNumber = 100;

    public static Ball getRandomBall() {
        final Random rand = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randColor = colorSupplier.getRandomColor();
        Integer randNumber = rand.nextInt(maxNumber);
        Ball randBall = new Ball(randColor, randNumber);
        return randBall;
    }
}