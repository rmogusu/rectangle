package models;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private int mLength;
    private int mWidth;
    private Boolean shape;
    private static List<Rectangle> instances = new ArrayList<Rectangle> ();
    private static ArrayList<Rectangle> mInstances = new ArrayList<Rectangle> ();
    public Rectangle(int length, int width) {
        this.mLength = length;
        this.mWidth = width;
        instances.add(this);
    }

    public static ArrayList getAll() {
        return  mInstances;
    }

    public static void clearAllPlaces() {
        instances.clear();
    }

    public int getLength() {
        return this.mLength;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isSquare() {
        if (mLength == mWidth){
            return true;
        }
        else {
            return false;
        }
    }
    public int area() {
        return mLength * mWidth;
    }
    public static List<Rectangle> all() {
        return instances;

    }

    public boolean getShape() {
        return isSquare ();
    }
}
