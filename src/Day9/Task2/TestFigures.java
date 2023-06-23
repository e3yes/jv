package Day9.Task2;

import Day9.Task2.Circle;
import Day9.Task2.Figure;
import Day9.Task2.Rectangle;
import Day9.Task2.Triangle;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red",10,10,10),
                new Triangle("Green",10,20,30),
                new Triangle("Red",10,20,15),
                new Rectangle("Red",5,10),
                new Rectangle("Orange",40,15),
                new Circle("Red",4),
                new Circle("Red",10),
                new Circle("Blue",5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
    public static double calculateRedPerimeter(Figure[] figures){
        double perimeters = 0;
        for(Figure figure: figures){
            if(figure.getColor().equals("Red")){
                perimeters += figure.perimeter();
            }
        }
        return perimeters;
    }

    public static double calculateRedArea(Figure[] figures){
        double perimeters = 0;
        for(Figure figure: figures){
            if(figure.getColor().equals("Red")){
                perimeters += figure.area();
            }
        }
        return perimeters;
    }
}
