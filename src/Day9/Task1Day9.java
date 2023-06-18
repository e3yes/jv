package Day9;

public class Task1Day9 {
    public static void main(String[] args) {
        Student student = new Student("Artem", "Maths");
        Teacher teacher = new Teacher("Alexey", "Math");
        student.printInfo();
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
    }
}
