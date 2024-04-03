package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int bonusQuantity = 70000;
    private final int salaryQuantity = 80;
    private final int bonusGoal = 10000;

    public Picker(Warehouse warehouse) {
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
        warehouse.upCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < bonusGoal) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += bonusQuantity;
            isPayed = true;
        }
    }
}
