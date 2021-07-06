/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.jlguenego.prime;

public class Prime {
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
