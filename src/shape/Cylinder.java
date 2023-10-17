package shape;

public class Cylinder extends Shape {

    private double r;

    public Cylinder(double h, double r) {
        super(h);
        this.r = r;
    }

    public double getRadius() {
        return this.r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double calcVolume() {
        return Math.PI * Math.pow(this.r, 2) * this.getHeight();
    }

    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
