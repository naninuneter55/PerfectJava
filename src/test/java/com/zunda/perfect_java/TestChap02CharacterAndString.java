package com.zunda.perfect_java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Unit test for simple App.
 */
public class TestChap02CharacterAndString 
{
    @Test
    public void _02_02_02_01()
    {
        String s = new String("0123456789");
        int actual = s.length();
        int expected = 10;
        assertThat(actual, is(expected));
    }

    
}
