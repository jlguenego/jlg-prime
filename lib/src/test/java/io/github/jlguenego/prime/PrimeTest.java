/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.jlguenego.prime;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeTest {
    @Test public void testIsPrime() {
        assertTrue("7 is prime", Prime.isPrime(7));
        assertFalse("8 is not prime", Prime.isPrime(8));
    }
}
