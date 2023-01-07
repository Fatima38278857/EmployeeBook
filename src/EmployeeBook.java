public class EmployeeBook {


    private String Name;
    private String Surname;
    private String MiddleName;
    private int Department ; // Отдел
    private double Salary; // Оплата ртуда
    static int id = 0;

    public EmployeeBook(String name, String Surname,String MiddleName, int Department, double Salary) {
        this.Name = name;
        this.Surname = Surname;
        this.MiddleName = MiddleName;
        this.Department = Department;
        this.Salary = Salary;
        id++;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public int getDepartment() {
        return Department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


    @Override
    public String toString() {
        return "EmployeeBook{" + "Name='" + Name + '\'' + ", Surname='" + Surname + '\'' + ", MiddleName='" + MiddleName + '\'' + ", Department=" + Department + ", Salary=" + Salary + '}';
    }
}


