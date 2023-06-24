package Day11.TaskOne;

public class Warehouse {
    public int countPickedOrders;
    public int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public String toString(){
        return "Picked orders: "+countPickedOrders+" Delivered Orders "+countDeliveredOrders;
    }
}
