package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1and2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("BMW","Mercedes"));
        list.add(1,"Lol");
        list.remove(0);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Для заполнения списка введите число начала списка");
        int firstNum = sc.nextInt();
        System.out.println("Теперь конец списка");
        int secondNum = sc.nextInt();
        System.out.println("Ваш список четных чисел в диапозоне от "+firstNum+" До "+secondNum);
        listAdder(firstNum,secondNum,list2);
        System.out.println(list2);
    }

    public static void listAdder(int until, int after, List list){
        int now = until;
        while(now<=after){
            now++;
            if(now%2==0){
                list.add(now);
            }
        }
    }
}
