package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        final Random rand = new Random();
        Color randColor = ColorSupplier.getRandomColor();
        Integer randNumber = rand.nextInt(100);
        Ball randBall = new Ball(randColor, randNumber);
        return randBall;
    }
}
