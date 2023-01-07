import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static EmployeeBook[] employee = new EmployeeBook[10];

    static NumberFormat divider = NumberFormat.getInstance(new Locale("ru", "RU"));
    public static void main(String[] args) {

        employee[0] = new EmployeeBook("Фатима", "Аксагова", "Магомедовна", 1, 30_00);
        employee[1] = new EmployeeBook("Марем", "Султыгова", "Уматгиреевна", 4, 90_00);
        employee[2] = new EmployeeBook("Залина", " Аксагова", "Магомедовна", 3, 40_00);
        employee[3] = new EmployeeBook(" Имран", "Гасаров", "Харонович", 5, 80_00);
        employee[4] = new EmployeeBook("Мадина", "Аксагова", " Магомедовна", 2, 50_00);
        employee[5] = new EmployeeBook("Магомед", "Аксагов", "Султанович", 5, 25_00);
        employee[6] = new EmployeeBook("Макка", "Аксагова", "Магомедовно", 3, 90_00);
        employee[7] = new EmployeeBook("Хава", "Аксагова", "Магомедовна", 1, 10_00);
        employee[8] = new EmployeeBook("Танзила", "Аксагова", "Магомедовна", 2, 50_00);
        employee[9] = new EmployeeBook("Ева", "Гасарова", " Хароновна", 4, 30_00);
    }


    public static void printAllWorkers(EmployeeBook[] employees) { // Распечатка работников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            printAllWorkers(employees); // вывод всех Ф.И.О, отдел, зарплата;
            System.out.println("-----------------------------");
        }
    }

    public static int calculateTheSalary(EmployeeBook[] employees) { // Ставка заработной платы
        int WageRate = 0;
        for (int i = 0; i < employees.length; i++) {
            WageRate = (int) (WageRate + employees[i].getSalary());
            System.out.println("Фонд заработной платы = " + divider.format(calculateTheSalary(employees)) + " руб.");
        }
        return WageRate;
    }

    public static void getMinMaxSalary(EmployeeBook[] employees) { // Минимальное и Максимальное значение
        int idMaxSalary = 0;
        int idMinSalary = 0;
        int a = (int) employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > a) {
                idMaxSalary = i;
                System.out.println("Сотрудник с максимальной заработной платой:\n " + employees[idMaxSalary]);
            }
            if (employees[i].getSalary() < a) {
                a = (int) employees[i].getSalary();
                idMinSalary = i;
                System.out.println("Сотрудник с минимальной заработной платой:\n " + employees[idMinSalary]);
            }
        }
        }
        public static void printNameWorkers(EmployeeBook[] employees) { // Распечатать сотрудников
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getMiddleName());
            }
            int averageSalary = calculateTheSalary(employees) / EmployeeBook.id;
            System.out.println("Средняя зарплата по предприятию за месяц = " + divider.format(averageSalary) + " руб.");
            System.out.println("-----------------------------");
        }

        }






