package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assert.Equals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }
    @Test
    public void twoBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));

    }


    @Test
    public void bracketsWithinBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));

    }

    @Test

    public void bracketsOfBracketsWithinBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));

    }

    @Test

    public void tripleBracketsOfBracketsWithinBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][]]]"));

    }

    @Test

    public void twoTripleBracketsOfBracketsWithinBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][]]]"));

    }

    @Test

    public void emptyStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test

    public void bracketsWithPizzaStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[pizza]"));

    }

    @Test

    public void onlyOpenBracketsLeftReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }

    @Test

    public void onlyOpenBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }

    @Test

    public void mismatchedBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

}
