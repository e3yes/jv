import java.util.Scanner;
public class TaskDay2 {
    public static void main(String[] args){
        System.out.println("Task1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во этажей в вашем доме");
        int n = sc.nextInt();
        if(n<=4 && n>0){
            System.out.println("У вас малоэтажный дом!");
        } else if (n<=8 && n>0) {
            System.out.println("У вас среднеэтажный дом!");
        } else if (n>=9 && n>0) {
            System.out.println("У вас многоэтажный дом!");
        } else {
            System.out.println("Вы долбаеб");
        }

        System.out.println();
        System.out.println("Task2");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>=b){
            System.out.println("Некорректный ввод");
        }
        for (int i=0;i<=b;i++){
            if (i%5==0 && i%10>0){
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Task3");
        int g = sc.nextInt();
        int s = sc.nextInt();
        if (g>=s){
            System.out.println("Некорректный ввод");
        }
        int i = 0;
        while(i<=s){
            if (i%5==0 && i%10>0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println();
        System.out.println("Task4");
        double x = sc.nextDouble();
        double y = 0;
        if (x>=5){
            y = ((x*x) - 10) / (x + 7);
            System.out.println("Используя формулу, y будет = "+y);
        } else if (x>-3 && x<5) {
            y = (x+3)*((x*x)-2);
            System.out.println("Используя формулу, y будет = "+y);
        } else{
            y = 420;
            System.out.println("Используя формулу, y будет = "+y);
        }
    }
}
