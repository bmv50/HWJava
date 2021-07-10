
public class HomeWorkApp {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(
                        "Иванов Иван Иванович",
                        "Ген.директор",
                        "gendirector@gmail.com",
                        "+79253567894",
                        1000000,
                        45),
                new Employee("Сидоров Сидор Сидорович",
                        "Зам. ген.директора",
                        "zamgendirector@gmail.com",
                        "+79602569841",
                        900000,
                        40),
                new Employee("Александров Александр Александрович",
                        "Финансовый директор",
                        "findirector@gmail.com",
                        "+79203567844",
                        800000,
                        42),
                new Employee("Иванова Светлана Ивановна",
                        "Главный бухгалтер",
                        "glavbuh@gmail.com",
                        "+79253697812",
                        500000,
                        35),
                new Employee("Романов Роман Романович",
                        "Водитель",
                        "driver@gmail.com",
                        "+79201254120",
                        10000,
                        21)
        };
        int minAge = 40;
        for (Employee employee : employees) {
            if (employee.age > minAge) {
                employee.printText();
                System.out.println();
            }
        }
    }
}