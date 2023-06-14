package Day6;
import java.util.Scanner;
public class TaskDay6 {
    public static void main(String[] args) {
        System.out.println("Введите что хотите создать, Автомобиль или Мотоцикл?");
        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        if (choose.equals("Автомобиль")){
            System.out.println("Введите год приобретения автомобиля");
            int years = sc.nextInt();
            Car car1 = new Car(years);
            System.out.println("Разница с годом приобретения и рождения машины = "+ car1.yearDifference(years));
        } else if (choose.equals("Мотоцикл")) {
            System.out.println("Введите год приобретения мотоцикла");
            int years = sc.nextInt();
            Motorbike mot1 = new Motorbike(years);
            System.out.println("Разница с годом приобретения и рождения мотоцикла = "+ mot1.yearDifference(years));
        }
    }
}
class Car{

    public static final int year = 1999;
    public Car(int year){
        System.out.println("Это автомобиль " + year+" Года");

    }

    public int yearDifference(int year){
        if (year > 0){
            int i = year - this.year;
            return i;
        } else {
            return 0;
        }
    }
}
class Motorbike{
    public static final int year = 2001;
    public Motorbike(int year){
        System.out.println("Это мотоцикл " + year+" Года");

    }

    public int yearDifference(int year){
        if (year > 0){
            int i = year - this.year;
            return i;
        } else {
            return 0;
        }
    }
}