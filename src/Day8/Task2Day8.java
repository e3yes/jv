package Day8;

public class Task2Day8 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
        System.out.println(airplane);
    }
}

class Airplane{
    public String manufacturer;
    public int year;
    public int length;
    public int weight;
    public int fuel;

    public String toString(){
        return "Изготовитель: "+manufacturer+" Год: "+year+" Длина: "+length+" Вес: "+weight+" Бак заполнен на: "+fuel;
    }

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
