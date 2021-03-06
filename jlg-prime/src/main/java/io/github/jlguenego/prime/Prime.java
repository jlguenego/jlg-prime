/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.jlguenego.prime;

/**
 * Class that offers tools about Prime numbers
 */
public class Prime {

    /**
     * Test if a number is prime (can be divided only by 1 and by itself).
     * @param nbr - the number to test
     * @return true if prime, false otherwise.
     */
    public static boolean isPrime(int nbr) {
        double sqrt = Math.sqrt(nbr);
        for (int i = 2; i < sqrt; i++) {
            if (nbr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
