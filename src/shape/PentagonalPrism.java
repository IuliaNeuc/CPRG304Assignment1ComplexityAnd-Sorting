package shape;

public class PentagonalPrism extends Shape {
    private double size;
    
    public PentagonalPrism(double h, double size) {
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
        return 5 * Math.pow(this.size, 2) * Math.tan(Math.toRadians(54)) / 4;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }

}
