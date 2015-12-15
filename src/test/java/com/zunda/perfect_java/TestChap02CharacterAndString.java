package com.zunda.perfect_java;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import java.lang.StringIndexOutOfBoundsException;
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

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void _02_02_02_02() throws Exception
    {
        String s = "abc";
        s.charAt(-1);
    }
    
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void _02_02_02_03() throws Exception
    {
        String s = "abc";
        s.charAt(3);
    }
    
    @Ignore("書籍記載の例外は発生しない。substring の第二パラメータ endIndex は String オブジェクトの長さより大きい場合該当の例外が発生する。3では発生しない。4で発生する。")
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void _02_02_02_04() throws Exception
    {
        String s = "abc";
        s.substring(1, 3);
    }
    
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void _02_02_02_05() throws Exception
    {
        String s = "abc";
        s.substring(1, 4);
    }
    
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void _02_02_02_06() throws Exception
    {
        String s = "abc";
        s.substring(2, 1);
    }
    
}
