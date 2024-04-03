package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;

    private final int bonusQuantity = 50000;
    private final int salaryQuantity = 100;
    private final int bonusGoal = 10000;

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
        salary += salaryQuantity;
        warehouse.upCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() < bonusGoal) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += bonusQuantity;
            isPayed = true;
        }
    }
}
