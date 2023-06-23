package Day9.Task2;

public class Circle extends Figure{

        private int radius;
        private String color;

        public Circle(String color,int radius){
            super(color);
            this.color = color;
            this.radius = radius;
        }

        @Override
        public double area() {
            double r = Math.PI * (radius*radius);
            return r;
        }

        @Override
        public double perimeter() {
            double f = 2 * Math.PI * this.radius;
            return f;
        }
}
