package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;

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
        salary += 80;
        warehouse.upCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 70000;
            isPayed = true;
        }
    }
}
