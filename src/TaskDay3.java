import java.util.Scanner;
public class TaskDay3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = null;
        String s = "Stop";
        System.out.println("Task1");
        System.out.println();
        while (true){
            System.out.println("Введите название города, а я напишу страну");
            x = sc.nextLine();
            if(x.equals(s)){
                break;
            }
            switch (x){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    continue;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    continue;
                default:
                    System.out.println("Неизвестная страна");
                    continue;
            }
        }



    }
}
