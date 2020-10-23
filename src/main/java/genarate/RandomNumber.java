package genarate;

import java.util.Random;

public class RandomNumber {
    static Random random = new Random();
    public static int genarate(int min, int max) {
       return random
               .ints(min, max)
               .findAny()
               .getAsInt();
    }
}
