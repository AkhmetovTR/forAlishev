package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Татьяна", "История");
        Student student1 = new Student("Иван");
        teacher1.evaluate(student1);
    }
}
