package shape;

import java.util.Comparator;


public class CompareVolume implements Comparator<Shape>
{
    // Overriding teh compare method from Comparator interface 
    //to compare shapes based on their base area
    @Override
    public int compare(Shape s1, Shape s2)
    {
        //Compare the base area of two shapes, s1 and s2
        //If the base area of s1 is greater than base area of s2 
        //return 1 to indicate that base area of s1 is greater
        //return -1 to indicate that base area of s1 is smaller than base area of s2
        //If bases areas are equal return 0;

        if(s1.calcVolume() > s2.calcVolume()) { // do we need this?
            return 1;
        }

        if(s1.calcVolume() < s2.calcVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}