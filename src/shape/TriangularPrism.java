package shape;

public class TriangularPrism extends Shape {
    
        private double size;
    
        public TriangularPrism(double h, double size) {
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
            return Math.pow(this.size, 2) * Math.sqrt(3) / 4;
        }
    
        @Override
        public double calcVolume() {
            return calcBaseArea() * getHeight();
        }
}