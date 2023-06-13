import java.util.Scanner;
public class TaskDay5 {
    public static void main(String[] args){
        Car smallCar = new Car();
        Scanner sc = new Scanner(System.in);

        System.out.println("Напишите какую желаете модель машины = ");
        String userModel = sc.nextLine();
        smallCar.setModel(userModel);

        System.out.println("Напишите какой цвет желаете = ");
        String userColor = sc.nextLine();
        smallCar.setColor(userColor);

        System.out.println("Напишите какого года = ");
        int userYears = sc.nextInt();
        smallCar.setYears(userYears);

        System.out.println("Хотите взорвать вашу машину?");
        smallCar.crashCar();

        System.out.println("Ваша машина:");
        System.out.println("Color = "+ smallCar.getColor());
        System.out.println("Model = "+ smallCar.getModel());
        System.out.println("Years = "+ smallCar.getYears());
    }
}
class Car{
    private String model;
    private String color;
    private int years;
    Scanner sc = new Scanner(System.in);

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setYears(int years){
        this.years = years;
    }

    public void crashCar(){
        String userChoose = sc.nextLine();
        if(userChoose.equals("Да")){
            this.model = null;
            this.color = null;
            this.years = 0;
        } else if (userChoose.equals("Нет")) {
            System.out.println("Окей");
        }
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYears(){
        return years;
    }
}
