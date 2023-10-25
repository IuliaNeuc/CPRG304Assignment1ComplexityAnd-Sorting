package shape;

public class SquarePrism extends Shape {

    private double size;

    public SquarePrism(double h, double size) {
        super(h);
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    @Override
    public double calcBaseArea() {
        return Math.pow(this.size, 2);
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
