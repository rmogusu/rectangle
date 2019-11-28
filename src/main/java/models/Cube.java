package models;

public class Cube {

    private Rectangle face;

    public Cube(Rectangle rectangle) {
        face = rectangle;
    }

    public Rectangle getFace() {
        return face;
    }

    public int volume() {
        int height = face.getLength();
        return height * height * height;
    }


    public int surfaceArea() {
        return face.area() * 6;

    }
}
