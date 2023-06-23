package Day9.Task2;

public class Rectangle extends Figure{

        private double width;
        private double height;
        private String color;
        public Rectangle(String color, double width, double height){
            super(color);
            this.width = width;
            this.height = height;
        }
        @Override
        public double area() {
            double l = width*height;
            return l;
        }

        @Override
        public double perimeter() {
            double r = 2 * (width+height);
            return r;
        }
}
