// I didn't want to delete the code here just in case. I just created the separate folders(CompareArea.java and CompareVolume.jav) for this code 
// It is just more comfortable for us to organize the code. Lets keep the App.java just like an app driver where we will call
//other methods here.

// package application;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// import shape.*;

// public class App {
//     public static void main(String[] args) {

//         Cone cone = new Cone(674.2435, 652.1534);
//         Cylinder cylinder = new Cylinder(9431.453, 4450.123);

//         ArrayList<Shape> shapes = new ArrayList<Shape>();
//         shapes.add(cylinder);
//         shapes.add(cone);

//         Collections.sort(shapes);
//         for (Shape l : shapes) {
//             System.out.println(l);
//         }

//         Comparator<Shape> comparator = new Comparator<Shape>() {
//             @Override
//             public int compare(Shape s1, Shape s2) {
//                 double area1 = s1.calcBaseArea();
//                 double area2 = s2.calcBaseArea();
//                 if (area1 < area2) {
//                     return -1;
//                 } else if (area1 > area2) {
//                     return 1;
//                 } else {
//                     double volume1 = s1.calcVolume();
//                     double volume2 = s2.calcVolume();
//                     if (volume1 < volume2) {
//                         return -1;
//                     } else if (volume1 > volume2) {
//                         return 1;
//                     } else {
//                         return 0;
//                     }
//                 }
//             }
//         };
//         Collections.sort(shapes, comparator);
//     }
// }
