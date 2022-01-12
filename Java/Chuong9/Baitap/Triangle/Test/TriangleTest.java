import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void checkTriangle1() {
        int a = 2;
        int b = 2;
        int c = 2;
        int expect = 1;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void checkTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        int expect = 2;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void checkTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        int expect = 3;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void checkTriangle4() {
        int a = 8;
        int b = 2;
        int c = 3;
        int expect = 0;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void checkTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;
        int expect = 0;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void checkTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;
        int expect = 0;
        int result = Triangle.checkTriangle(a,b,c);
        assertEquals(expect,result);
    }
}