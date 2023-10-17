package shape;

public abstract class Shape implements Comparable<Shape> {

    private double h;

    public Shape(double h) {
        this.h = h;
    }    

    public double getHeight() {
        return this.h;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    public abstract double calcVolume();

    public abstract double calcBaseArea();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.h, other.h);
    }

    @Override
    public String toString() {
        return String.format("Height: %.2f, Volume: %.2f, Base Area: %.2f", this.h, this.calcVolume(), this.calcBaseArea());
    }
}


