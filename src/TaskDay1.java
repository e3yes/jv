import java.util.Scanner;

public class TaskDay1 {
    public static void main(String[] args){
        System.out.println("Task1");
        int n = 0;
        while (n!=10){
            System.out.print("JAVA ");
            n += 1;
        }
        System.out.println();
        System.out.println("Task2");
        for(int i=0;i<=9;i++){
            System.out.print("JAVA ");
        }
        System.out.println();
        System.out.println("Task3");
        for(int i=0;i<=9;i++){
            System.out.println("JAVA");
        }

        System.out.println();
        System.out.println("Task4");
        int year = 1980;
        while(year<=2020){
            System.out.println("Олимпиада "+ year + " года");
            year += 4;
        }

        System.out.println();
        System.out.println("Task5");
        for(int i = 1980;i<=2020;i+=4){
            System.out.println("Олимпиада "+ i + " года");
        }

        System.out.println();
        System.out.println("Task6");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int x = sc.nextInt();
        System.out.println("Таблица умножение на число "+x);
        for(int f = 1;f<=9;f++){
            int result = f*x;
            System.out.println(f+"*"+x+"= "+result);
        }
    }

}
