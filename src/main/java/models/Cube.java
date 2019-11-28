package models;

public class Cube {
    private Rectangle mFace;
    public Cube(Rectangle rectangle) {

        mFace = rectangle;
    }

    public Rectangle getFace() {
        return mFace;
    }

    public int volume() {
        int length = mFace.getLength();
        return length * length * length;

    }

    public int surfaceArea() {
        return mFace.area() * 6;
    }
}
