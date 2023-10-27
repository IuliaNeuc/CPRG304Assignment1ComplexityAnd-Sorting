package shape;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape>  {
    
    private double height;
    private double volume;
    private double baseArea;

    // constructor
    public Shape(double height) {
        this.height = height;
    }
    
    // getters and setters
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return this.volume;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }
    public double getBaseArea() {
        return this.baseArea;
    }

    // abstract methods
    public abstract double calcVolume();
    public abstract double calcBaseArea();

    // comparable interface
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.height, other.height);
    }

    // comparator interface
    // @Override
    // public int compare(Shape s1, Shape s2) {
    //     return Double.compare(s1.calcBaseArea() + s1.getVolume(), s2.calcBaseArea() + s2.getVolume());
    // }

    
    @Override
    public int compare(Shape s1, Shape s2)
    {
        

        if(s1.calcVolume() > s2.calcVolume()) {
            return 1;
        }

        if(s1.calcVolume() < s2.calcVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // @Override
    // public int compare(Shape s1, Shape s2)
    // {
        
    //     if(s1.calcBaseArea() > s2.calcBaseArea()) {
    //         return 1;
    //     }
            
    //     if(s1.calcBaseArea() < s2.calcBaseArea()) {
    //         return -1;
    //     } else {
    //         return 0;
    //     } 
    // }
    


    // toString
    @Override
    public String toString() {

        return String.format("Height: %.2f, Volume: %.2f, Base Area: %.2f", this.height, this.calcVolume(), this.calcBaseArea());
    }
}


