import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGetNextDate() {
        String date = "01/01/2018";
        String expected = "02/01/2018";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
    @Test
    void testGetNextDate2() {
        String date = "31/01/2018";
        String expected = "01/02/2018";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
    @Test
    void testGetNextDate3() {
        String date = "30/04/2018";
        String expected = "01/05/2018";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
    @Test
    void testGetNextDate4() {
        String date = "28/02/2018";
        String expected = "01/03/2018";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
    @Test
    void testGetNextDate5() {
        String date = "29/02/2020";
        String expected = "01/03/2020";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
    @Test
    void testGetNextDate6() {
        String date = "31/12/2018";
        String expected = "01/01/2019";
        String result = Main.getNextDate(date);
        assertEquals(expected, result);
    }
}
