package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Петя","Группа 1");
        Teacher teacher1 = new Teacher("Татьяна","Математика");
        System.out.println(student1.getGroupName());
        System.out.println(teacher1.getSubjectName());
        student1.printInfo();
        teacher1.printInfo();
    }
}
