package Day9;

public abstract class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}

class Student extends Human{
    private String groupName;
    private String name;

    public Student(String name, String groupName){
        super(name);
        this.name = name;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    @Override
    public void printInfo(){
        System.out.println("Этот человек с именем "+this.name);
        System.out.println("Этот человек с именем "+this.name);
    }
}

class Teacher extends Human{
    private String name;
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }
    public Teacher(String name,String subjectName){
        super(name);
        this.name = name;
        this.subjectName = subjectName;
    }
    @Override
    public void printInfo(){
        System.out.println("Этот человек с именем "+this.name);
        System.out.println("Этот преподователь с именем "+this.name);
    }
}