package shape;

public class Cylinder extends Shape {
    private double radius;

    // constructor
    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    // set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // get radius
    public double getRadius() {
        return this.radius;
    }

    // calculate volume
    @Override
    public double calcVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.getHeight();
    }

    // calculate base area
    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
