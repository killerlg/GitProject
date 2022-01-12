import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFizzBuzz1() {
        int number = 0;
        String expect = "FizzBuzz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }
    @Test
    void testFizzBuzz2() {
        int number = 3;
        String expect = "Fizz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }
    @Test
    void testFizzBuzz3() {
        int number = 5;
        String expect = "Buzz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }

    @Test
    void testFizzBuzz4() {
        int number = 4;
        String expect = "bon";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }

    @Test
    void testFizzBuzz5() {
        int number = 10;
        String expect = "Buzz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }

    @Test
    void testFizzBuzz6() {
        int number = 35;
        String expect = "FizzBuzz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }
    @Test
    void testFizzBuzz7() {
        int number = 53;
        String expect = "FizzBuzz";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }

    @Test
    void testFizzBuzz8() {
        int number = 98;
        String expect = "chin tam";
        String result = Main.fizzBuzz(number);
        assertEquals(expect,result);
    }
}