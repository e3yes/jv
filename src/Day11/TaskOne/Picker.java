package Day11.TaskOne;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;

    public Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse){
        this.salary = salary;
        this.warehouse = warehouse;
    }
    public String toString(){
        return "Зарплата "+salary+" Выплачено = "+isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countPickedOrders++;
        System.out.println("Доставщик Поработал");

    }

    @Override
    public void bonus() {
        if(isPayed == false || warehouse.countPickedOrders >= 100){
            System.out.println("Начисляется бонус в 70 рублей");
            salary+=70;
            isPayed = true;
        } else if (isPayed == true){
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
