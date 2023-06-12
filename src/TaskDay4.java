import java.util.Scanner;
import java.util.Random;
public class TaskDay4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите длину массива");
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i = 0;i<x;i++) {
            int p = rand.nextInt(10);
            a[i] = p;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Информация о массиве");
        System.out.println("Длина массива = "+a.length);
        int o = 0;
        int o2 = 0;
        int o3 = 0;
        int o4 = 0;
        int s = 0;
        for(int i:a){
            s+=i;
            if (i>8){
                o+=1;
            } else if (i==1) {
                o2 += 1;
                o4 += 1;
            } else if (i==0) {
                o4+=1;
            } else if (i%2==0) {
                o3 += 1;
            } else if (i%2>0) {
                o4 += 1;
            }
        }
        System.out.println("Кол-во чисел больше 8 = "+o);
        System.out.println("Кол-во чисел равных 1 = "+o2);
        System.out.println("Кол-во четных = "+o3);
        System.out.println("Кол-во нечетных = "+o4);
        System.out.println("Сумма всех элементов = "+s);

    }
}
