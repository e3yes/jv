import java.util.Scanner;
public class Task3Day3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<=4;i++){
            System.out.println("Введите делимое и делитель");
            int x = sc.nextInt();
            int f = sc.nextInt();
            if(f==0){
                System.out.println("Деление на 0");
                continue;
            }
            double g = x/f;
            System.out.println(g);
        }
    }
}
