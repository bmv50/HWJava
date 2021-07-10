public class Employee {
    String fullName;
    String position;
    String mail;
    String phoneNumber;
    int salary;
    int age;

    Employee(String fullName, String position, String mail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printText() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + mail);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}
