package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void testEmptyString()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void balancedBracketsWithOtherTextReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch{}]Code[]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void unBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test void closingBracketsWithoutOpenBracketsFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
}