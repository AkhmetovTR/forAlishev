package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Заработная плата: " + salary + ", выплата бонуса: " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.upCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 50000;
            isPayed = true;
        }
    }
}
