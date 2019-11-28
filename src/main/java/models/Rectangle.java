package models;

import java.util.ArrayList;

/**
 * Created by staff on 7/10/17.
 */
public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> mInstances = new ArrayList<>();
    private Boolean shape;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.shape = isSquare();
        mInstances.add(this);
    }

    public static void clearAllPlaces() {

        return
    }

    public int getLength() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static ArrayList<Rectangle> all() {
        return mInstances;
    }

    public boolean getShape(){
        return shape;
    }

    public boolean isSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }

    public int area() {
        return height * width;
    }

}
