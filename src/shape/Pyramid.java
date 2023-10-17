package shape;

public class Pyramid extends Shape{
    
    private double size;

    public Pyramid(double h, double size) {
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
    public double calcVolume() {
        return Math.pow(this.size, 2) * this.getHeight() / 3;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(this.size, 2);
    }
    
}
