package shape;

public class OctagonalPrism extends Shape{

    private double size;

    public OctagonalPrism(double h, double size) {
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
        return 2 * Math.pow(this.size, 2) * (1 + Math.sqrt(2));
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
