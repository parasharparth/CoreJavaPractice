package practice.december16;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    public static void main(String[] args)
    {
        /***************************************************************************
         * There are 4 ways in which we can generate random numbers
         * using random() method
         * using Random class
         * using ThreadLocalRandom
         * using ints() method (Java-8)
         ***************************************************************************/
        System.out.println("Using random() method: "+randomMethod());
        System.out.println("Using Random class: "+randomClass());
        System.out.println("Using the ThreadLocalRandom class: "+threadLocalRandomClass());
        System.out.print("Using the ints() method: ");
        new Random().ints(1).forEach(System.out::print);
    }

    public static int threadLocalRandomClass()
    {
            return ThreadLocalRandom.current().nextInt();
    }

    public static int randomClass()
    {
        return new Random().nextInt(100);
    }
    public static double randomMethod()
    {
        return Math.random();
    }

}
