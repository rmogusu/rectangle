package models;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle (2, 4);
        assertEquals (true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsLength_2() {
        Rectangle testRectangle = new Rectangle (2, 4);
        assertEquals (2, testRectangle.getLength ());
    }

    @Test
    public void getWidth_getsRectangleWidth_4() {
        Rectangle testRectangle = new Rectangle (2, 4);
        assertEquals (4, testRectangle.getWidth ());
    }

    @Test
    public void isSquare_whenNotASquare_false() {
        Rectangle testRectangle = new Rectangle (2, 4);
        assertEquals (false, testRectangle.isSquare ());
    }

    @Test
    public void isSquare_allSidesEqual_true() {
        Rectangle testRectangle = new Rectangle (2, 2);
        assertEquals (true, testRectangle.isSquare ());
    }

    @Test
    public void area_returnsTheAreaOfTheRectangle_450() {
        Rectangle testRectangle = new Rectangle (15, 30);
        assertEquals (450, testRectangle.area ());
    }

    @Test
    public void all_returnsAllInstancesOfRectangle_true() {
        Rectangle firstRectangle = new Rectangle (10, 20);
        Rectangle secondRectangle = new Rectangle (5, 5);
        assertTrue (Rectangle.all ().contains (firstRectangle));
        assertTrue (Rectangle.all ().contains (secondRectangle));
    }

    @After

    public void tearDown() throws Exception {
        Rectangle.clearAllPlaces ();
    }
}