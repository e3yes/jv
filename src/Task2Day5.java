import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Task2Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите создать мотоцикл?");
        String choose = sc.nextLine();
        if (choose.equals("Да")){
            System.out.println("Задайте ему параметры, Модель = ");
            String md = sc.nextLine();
            System.out.println("Цвет");
            String cl = sc.nextLine();
            System.out.println("Год");
            int ye = sc.nextInt();
            Motorbike motorcycle = new Motorbike(md,cl,ye);
            System.out.println("Ваш мотоцикл создан, его параметры = ");
            System.out.println("Модель = " + motorcycle.getModel());
            System.out.println("Цвет = " + motorcycle.getColor());
            System.out.println("Год = " + motorcycle.getYears());
        } else if (choose.equals("Нет")) {
            System.out.println("Ок");
        }
    }
}
class Motorbike{
    private String model;
    private String color;
    private int years;

    public Motorbike(String model, String color, int years){
        this.model = model;
        this.color = color;
        this.years = years;
    }

    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYears(){
        return this.years;
    }
}