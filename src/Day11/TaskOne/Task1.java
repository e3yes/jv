package Day11.TaskOne;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier petya = new Courier(0,warehouse);
        Picker vanya = new Picker(0,warehouse);
        businessProcess(vanya);
        businessProcess(petya);
        System.out.println("Курьер зп "+vanya.getSalary());
        System.out.println("Доставщик зп "+petya.getSalary());
        System.out.println("Доставлено = "+warehouse.getCountDeliveredOrders());
        System.out.println("Собрано = "+warehouse.getCountPickedOrders());
        vanya.doWork();
        petya.doWork();
        vanya.bonus();
        petya.bonus();
        System.out.println("Выплачено Курьеру = "+vanya.isPayed());
        System.out.println("Выплачено Доставщику = "+petya.isPayed());
        vanya.bonus();
        petya.bonus();
        Warehouse warehouse2 = new Warehouse();
        Courier vasya = new Courier(0,warehouse2);
        Picker tima = new Picker(0,warehouse2);
        tima.doWork();
        vasya.doWork();
        System.out.println(tima.getSalary());
        System.out.println(vasya.getSalary());
        System.out.println(petya.getSalary());
        System.out.println(vanya.getSalary());
    }
    static void businessProcess(Worker worker){
        for(int i=0;i<=9;i++){
            worker.doWork();
        }
    }

}
