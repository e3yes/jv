package Day6;
import java.util.Scanner;
public class Task2Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Для создания самолета задайте ему параметры:");
        System.out.println("Изготовитель = ");
        String manu = sc.nextLine();
        System.out.println("Год выпуска =");
        int year = sc.nextInt();
        System.out.println("Длина =");
        int length = sc.nextInt();
        System.out.println("Вес =");
        int weight = sc.nextInt();
        Airplane airplane = new Airplane(manu, year, length, weight);
        System.out.println("Ваш самолет = ");
        airplane.info();
        System.out.println("Хотите заполнить бак?");
        String lol = sc1.nextLine();

        if(lol.equals("Да")){
            System.out.println("Введите количество топлива");
            int n = sc.nextInt();
            airplane.fillUp(n);
            System.out.println("Успешно");
            airplane.info();
        } else {
            System.out.println("Ваш самолллллеее..10000111000101010");
        }
    }
}

class Airplane{
    public String manufacturer;
    public int year;
    public int length;
    public int weight;
    public int fuel;

    public Airplane(String manufacturer, int year,int length,int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель = " + manufacturer);
        System.out.println("Год выпуска = "+year);
        System.out.println("Длина = "+length);
        System.out.println("Вес = "+weight);
        System.out.println("Бак заполнен на " + fuel);
    }

    public void fillUp(int n){
        this.fuel = n;
    }

}
