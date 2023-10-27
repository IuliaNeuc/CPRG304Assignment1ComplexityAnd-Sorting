package shape;

import java.util.Comparator;

public class CompareVolume implements Comparator<Shape>
{
    // Overriding teh compare method from Comparator interface 
    //to compare shapes based on their base area
    @Override
    public int compare(Shape s1, Shape s2)
    {
        double diff = s1.calcVolume() - s2.calcVolume();
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}