
import static org.junit.Assert.*;
import org.junit.Test;


public class Count8Test {

    @Test
    public void testCount1(){
        // Test cases
        assertEquals(1, Recursion.count8(8));
    }

    @Test
    public void testCount2(){
        // Test cases
        assertEquals(2, Recursion.count8(818));
    }

    @Test
    public void testCount3(){
        // Test cases
        assertEquals(3, Recursion.count8(8818));
    }

    @Test
    public void testCount4(){
        // Test cases
        assertEquals(0, Recursion.count8(123456));
    }

    @Test
    public void testCount6(){
        // Test cases
        assertEquals(2, Recursion.countHi("xxhixxhi"));
    }

    @Test
    public void testCount7(){
        // Test cases
        assertEquals(2, Recursion.countHi("xxhixxhih"));
    }

    @Test
    public void testCount8(){
        // Test cases
        assertEquals(1, Recursion.countHi("himom"));
    }

    @Test
    public void testCount9(){
        // Test cases
        assertEquals(3, Recursion.countHi("xxhixxhihi"));
    }

    @Test
    public void testCount10(){
        // Test cases
        assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void testStr1() {
        assertEquals(1, Recursion.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStr2() {
        assertEquals(2, Recursion.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStr3() {
        assertEquals(1, Recursion.strCount("catcowcatdog", "dog"));
    }

    @Test
    public void testStr4() {
        assertEquals(3, Recursion.strCount("catcowcatcowcow", "cow"));
    }

    @Test
    public void testStr5() {
        assertEquals(1, Recursion.strCount("catcowcat", "catcowcat"));
    }

    @Test
    public void testStringClean1() {
        assertEquals("yza", Recursion.stringClean("yyzzza"));
    }

    @Test
    public void testStringClean2() {
        assertEquals("Helo", Recursion.stringClean("Hello"));
    }

    @Test
    public void testStringClean3() {
        assertEquals("abcd", Recursion.stringClean("aabbccdd"));
    }

    @Test
    public void testStringClean4() {
        assertEquals("yzab", Recursion.stringClean("yyzzzab"));
    }

    @Test
    public void testStringClean5() {
        assertEquals("zya", Recursion.stringClean("zzzyyyaaa"));
    }





}//end class