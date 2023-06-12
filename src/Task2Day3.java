import java.util.Scanner;
public class Task2Day3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите делимое и делитель");
            double x = sc.nextDouble();
            double s = sc.nextDouble();
            if(s==0){
                break;
            }
            double p = x/s;
            System.out.println(p);

        }
    }
}
