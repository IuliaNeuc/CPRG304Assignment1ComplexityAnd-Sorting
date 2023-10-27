package shape;

public class Cone extends Shape {
    private double radius;

    // constructor
    public Cone(double height, double radius) {
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
        return (1.0/3.0) * Math.PI * Math.pow(this.radius, 2) * this.getHeight();
    }

    // calculate base area
    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
