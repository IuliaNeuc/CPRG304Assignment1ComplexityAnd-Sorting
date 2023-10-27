package shape;

public class Pyramid extends Shape{
    private double baseArea;

    public Pyramid(double height, double baseArea) {
        super(height);
        this.baseArea = baseArea;
    }
    
    public double getbaseArea() {
        return this.baseArea;
    }

    public void setbaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    @Override
    public double calcVolume() {
        return Math.pow(this.baseArea, 2) * this.getHeight() / 3;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(this.baseArea, 2);
    }
    
}
