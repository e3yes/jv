package Day11.TaskOne;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;

    private Warehouse warehouse = new Warehouse();

    public Courier(int salary, Warehouse warehouse){
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
        warehouse.countDeliveredOrders++;
        System.out.println("Курьер Поработал");
    }

    @Override
    public void bonus() {
        if(isPayed == false || warehouse.countDeliveredOrders >= 100){
            System.out.println("Начисляется бонус в 50 рублей");
            salary+=50;
            isPayed = true;
        } else if (isPayed == true){
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
