package models;

import org.junit.Test;

import org.junit.Test;

import static org.junit.Assert.*;


public class CubeTest {

    @Test
    public void newCubeInstantiatesCorrectly() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(true, testCube instanceof Cube);
    }

    @Test
    public void newCube_savesRectangleInformation_Rectangle() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(testRectangle, testCube.getFace());
    }

    @Test
    public void volume_determinesTheVolumeOfTheCube_27000() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.volume());
    }

    @Test
    public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() throws Exception{
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.surfaceArea());
    }

    @Test
    public void area_returnsTheAreaOfTheRectangle_450() throws Exception{
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }


}
