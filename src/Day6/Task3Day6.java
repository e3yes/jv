package Day6;
import java.util.Random;
import java.util.Scanner;
public class Task3Day6 {
    public static void main(String[] args) {
        System.out.println("Назовите свое имя, новый ученик");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student vanya = new Student(name);
        System.out.println("Привет "+name);
        System.out.println("Выберите имя учителя ");
        String nameTeacher = sc.nextLine();
        Teacher teach = new Teacher(nameTeacher);
        teach.evaluate();
    }
}

class Teacher{
    public static String name = "Любовь";
    public static final String object = "Русский";

    public Teacher(String name){
        this.name = name;
        System.out.println("Всем добрый день");
    }

    public void evaluate(){
        Random random = new Random();
        int evaluation = random.nextInt(1,5);
        String evaluationName = "Нет оценки";
        if (evaluation <= 2){
            evaluationName = "Неудовлетворительно";
        } else if (evaluation == 3) {
            evaluationName = "Удовлетворительно";
        } else if (evaluation == 4) {
            evaluationName = "Хорошо";
        } else if (evaluation == 5) {
            evaluationName = "Отлично";
        }
        System.out.println("Преподаватель "+this.name+" оценил студента с именем "+Student.name+" по предмету "+this.object);
        System.out.println("На оценку = " + evaluation + "'"+evaluationName+"'");
    }
}
class Student{
    public static String name;

    public Student(String name){
        this.name = name;
    }
}